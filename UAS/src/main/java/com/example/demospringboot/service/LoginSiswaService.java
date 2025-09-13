package com.example.demospringboot.service;
import com.example.demospringboot.entity.Sistem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.LoginSiswa;
import com.example.demospringboot.repository.LoginSiswaRepository;

@Service
public class LoginSiswaService extends Sistem {  // Meng-extend Sistem untuk implementasi abstract method

    @Autowired
    private LoginSiswaRepository loginRepositorySiswa;

    // Implementasi abstract method
    @Override
    public void masuk() {
        System.out.println("Login siswa berhasil."); 
    }

    public List<LoginSiswa> getAllLogin() {
        return loginRepositorySiswa.findAll();
    }

    public LoginSiswa getLoginByUsername(String username) {
        return loginRepositorySiswa.findByUsername(username);
    }

    public LoginSiswa addLogin(LoginSiswa login) {
        return loginRepositorySiswa.save(login);
    }

    public LoginSiswa updateLogin(String username, LoginSiswa login) {
        return loginRepositorySiswa.save(login);
    }
}

