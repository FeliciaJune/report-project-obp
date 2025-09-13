package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demospringboot.entity.Prestasi;
import com.example.demospringboot.service.PrestasiService;
import java.util.List;

@Controller
public class PrestasiController {

    @Autowired
    private PrestasiService prestasiService;

    @GetMapping("/inputprestasi")
    public String prestasiPage(Model model) {
        model.addAttribute("prestasiInfo", new Prestasi()); 
        return "inputprestasi";  
    }

    @GetMapping("/daftarprestasi")
    public String daftarPrestasiPage(Model model) {
        List<Prestasi> prestasiList = prestasiService.getAllPrestasi();  
        model.addAttribute("prestasiList", prestasiList);  
        return "daftarprestasi"; 
    }

    @PostMapping("/submitprestasi")
    public String prestasiAdd(@ModelAttribute("prestasiInfo") Prestasi prestasiInfo, Model model) {
        prestasiService.addPrestasi(prestasiInfo);  
        return "redirect:/daftarprestasi"; 
    }
}
