package com.example.demospringboot.repository;

import com.example.demospringboot.entity.LoginGuru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LoginGuruRepository extends JpaRepository<LoginGuru, Integer> {    
    LoginGuru findByUsername(String username);
}