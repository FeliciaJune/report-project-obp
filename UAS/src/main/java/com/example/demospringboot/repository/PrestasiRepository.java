package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Prestasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestasiRepository extends JpaRepository<Prestasi, String> {  
    Optional<Prestasi> findByNisn(String nisn); 
    void deleteByNisn(String nisn); 
}
