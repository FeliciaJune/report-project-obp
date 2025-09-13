package com.example.demospringboot.controller;

import com.example.demospringboot.entity.LoginGuru;
import com.example.demospringboot.entity.Nilai;

import com.example.demospringboot.repository.NilaiRepository;
import com.example.demospringboot.repository.LoginGuruRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginGuruController {

    @Autowired
    private LoginGuruRepository loginGuruRepository;

    @Autowired
    private NilaiRepository nilaiRepository;

   
    

    
    @PostMapping("/LoginGuru")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,
            RedirectAttributes redirectAttributes) {

        LoginGuru guru = loginGuruRepository.findByUsername(username);

       
        if (guru != null) {
          
            if (guru.getPassword().equals(password)) {
                
                redirectAttributes.addAttribute("username", username); 
                return "redirect:/homeguru"; 
            } else {
                model.addAttribute("error", "Password anda salah! Coba Lagi?");
            }
        } else {

            model.addAttribute("error", "Username tidak valid.");
        }

        
        return "LoginGuru";  
    }

    @GetMapping("/homeguru")
    public String showHomeGuru(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "homeguru"; 
    }

    // @GetMapping("/menuguru2")
    // public String showMenuGuru2() {
    //     return "menuguru2"; 
    // }

    @GetMapping("/RapotGuru")
    public String showrapotGuru(Model model) {

     
        List<Nilai> nilaiList = nilaiRepository.findAll();

       
        model.addAttribute("nilaiList", nilaiList);

        return "RapotGuru"; 
    }

    @GetMapping("/LogoutGuru")
    public String showLogoutGuru() {
        return "logoutguru"; 
    }

    @GetMapping("/LoginGuru")
    public String showLoginGuru() {
   
        return "loginguru"; 
    }

    @GetMapping("/menuguru2")
public String redirectToMenuguru() {
    // return the view you want to redirect to
    return "menuguru2";  // or any other template you need
}

@GetMapping("/Home")
    public String showHome() {
   
        return "home"; 
    }

}


