package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NilaiRepository extends JpaRepository<Nilai, Integer> {
    
    // Cari berdasarkan NISN
    Optional<Nilai> findByNisn(int nisn);

    // Cari semua nilai berdasarkan nama
    List<Nilai> findByNama(String nama);

    // Hapus nilai berdasarkan NISN
    void deleteByNisn(int nisn);
}
