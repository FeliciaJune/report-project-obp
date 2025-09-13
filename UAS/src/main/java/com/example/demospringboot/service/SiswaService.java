package com.example.demospringboot.service;
import com.example.demospringboot.entity.Sistem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.Siswa;
import com.example.demospringboot.repository.SiswaRepository;
import java.util.List;

@Service
public class SiswaService extends Sistem { // Meng-extend Sistem untuk implementasi abstract method

    @Autowired
    private SiswaRepository siswaRepository;

    // Constructor untuk Sistem
    public SiswaService() {
        super("defaultUsername", "defaultPassword");
    }

    // Implementasi abstract method
    @Override
    public void masuk() {
        System.out.println("Siswa berhasil masuk ke sistem.");
    }

    public List<Siswa> getAllSis() {
        return siswaRepository.findAll();
    }

    public Siswa getSisByNisn(int nisn) {
        return siswaRepository.findByNisn(nisn).orElse(null);
    }

    public Siswa addSis(Siswa sis) {
        return siswaRepository.save(sis);
    }

    public Siswa updateSis(int nisn, Siswa sis) {
        sis.setNisn(nisn);
        return siswaRepository.save(sis);
    }

    public void deleteSis(int nisn) {
        siswaRepository.deleteByNisn(nisn);
    }
}
