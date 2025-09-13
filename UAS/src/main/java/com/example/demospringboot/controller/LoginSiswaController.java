package com.example.demospringboot.controller;

import com.example.demospringboot.entity.LoginSiswa;
import com.example.demospringboot.repository.LoginSiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginSiswaController {

    @Autowired
    private LoginSiswaRepository loginSiswaRepository;

    @GetMapping("/loginsiswa")
    public String showLoginForm() {
        return "loginsiswa";  
    }

    @PostMapping("/loginsiswa")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        LoginSiswa siswa = loginSiswaRepository.findByUsername(username);

        if (siswa != null) {
            if (siswa.getPassword().equals(password)) {
                model.addAttribute("username", username);
                return "homemurid";  
            } else {
                model.addAttribute("error", "Password salah.");
            }
        } else {
            model.addAttribute("error", "Username tidak ditemukan.");
        }

        return "loginsiswa";  
    }

}
