package com.example.demospringboot.repository;
import com.example.demospringboot.entity.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository

public interface SiswaRepository
extends JpaRepository<Siswa, Integer> {  
    Optional<Siswa> findByNisn(int nisn);
    void deleteByNisn(int nisn); 
}