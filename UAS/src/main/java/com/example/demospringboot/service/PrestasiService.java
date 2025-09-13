package com.example.demospringboot.service;
import com.example.demospringboot.entity.Sistem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.Prestasi;
import com.example.demospringboot.repository.PrestasiRepository;
import java.util.List;

@Service
public class PrestasiService extends Sistem { // Meng-extend Sistem untuk implementasi abstract method

    @Autowired
    private PrestasiRepository prestasiRepository;

     // Konstruktor default
    public PrestasiService() {
        super();
    }

    // Implementasi method abstract
    @Override
    public void masuk() {
        System.out.println("Login berhasil ke sistem Prestasi.");
    }

    public void addPrestasi(Prestasi prestasi) {
        prestasiRepository.save(prestasi);
    }

    public List<Prestasi> getAllPrestasi() {
        return prestasiRepository.findAll();
    }
}
