package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.LoginGuru;
import com.example.demospringboot.entity.Sistem;
import com.example.demospringboot.repository.LoginGuruRepository;

import java.util.List;

@Service
public class LoginGuruService extends Sistem { // Meng-extend Sistem untuk implementasi abstract method

    @Autowired
    private LoginGuruRepository loginRepositoryGuru;

    // Konstruktor default
    public LoginGuruService() {
        super(); // Memanggil konstruktor default di Sistem
    }

    // Konstruktor dengan parameter untuk memanggil konstruktor superclass
    public LoginGuruService(String username, String password) {
        super(username, password);
    }

    // Implementasi abstract method
    @Override
    public void masuk() {
        System.out.println("Login guru berhasil.");
    }

    public List<LoginGuru> getAllLogin() {
        return loginRepositoryGuru.findAll();
    }

    public LoginGuru getLoginByUsername(String username) {
        return loginRepositoryGuru.findByUsername(username);
    }

    public LoginGuru addLogin(LoginGuru login) {
        return loginRepositoryGuru.save(login);
    }

    public LoginGuru updateLogin(String username, LoginGuru login) {
        return loginRepositoryGuru.save(login);
    }
}
