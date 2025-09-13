package com.example.demospringboot.repository;

import com.example.demospringboot.entity.LoginSiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginSiswaRepository extends JpaRepository<LoginSiswa, Integer> {
    LoginSiswa findByUsername(String username);
}
