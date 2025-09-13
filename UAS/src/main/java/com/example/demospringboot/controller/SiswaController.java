package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demospringboot.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demospringboot.entity.Nilai;
import com.example.demospringboot.entity.Siswa;
import com.example.demospringboot.repository.NilaiRepository;  // Import NilaiRepository
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class SiswaController {

    @Autowired
    private SiswaService siswaService;

    @Autowired
    private NilaiRepository nilaiRepository;  

    @GetMapping("/siswa")
    public String siswaPage2(Model model) {
        List<Siswa> sisList;
        model.addAttribute("sisList", siswaService.getAllSis());
        model.addAttribute("sisInfo", new Siswa());
        return "siswa.html";
    }

    @GetMapping("/siswa/{nisn}")
    public String siswaGetRec(Model model, @PathVariable("nisn") int nisn) {
        Siswa sisRec;
        model.addAttribute("sisList", siswaService.getAllSis());
        model.addAttribute("sisRec", siswaService.getSisByNisn(nisn));
        return "siswa.html";
    }

    @PostMapping(value = "/siswa/submit/", params = { "add" })
    public String siswaAdd(Model model, @ModelAttribute("sisInfo") Siswa sisInfo) {
        Siswa sis = siswaService.addSis(sisInfo);
        model.addAttribute("sisList", siswaService.getAllSis());
        return "redirect:/siswa";
    }

    @PostMapping(value = "/siswa/submit/{nisn}", params = { "edit" })
    public String siswaEdit(Model model, @ModelAttribute("sisInfo") Siswa sisInfo, @PathVariable("nisn") int nisn) {
        Siswa sis = siswaService.updateSis(nisn, sisInfo);
        model.addAttribute("sisList", siswaService.getAllSis());
        return "redirect:/siswa";
    }

    @PostMapping(value = "/siswa/submit/{nisn}", params = { "delete" })
    public String siswaDelete(Model model, @ModelAttribute("sisInfo") Siswa sisInfo, @PathVariable("nisn") int nisn) {
        siswaService.deleteSis(nisn);
        model.addAttribute("sisList", siswaService.getAllSis());
        return "redirect:/siswa";
    }

    @GetMapping("/LogoutSiswa")
    public String showLogoutsiswa() {
        return "logoutsiswa";  
    }

    @GetMapping("/LoginSiswa")
    public String showLoginsiswa() {
        return "loginsiswa";  
    }

    @GetMapping("/RapotSiswa")
    public String showRapotSiswa(Model model) {
        List<Nilai> nilaiList = nilaiRepository.findAll();  
        model.addAttribute("nilaiList", nilaiList);  
        return "RapotSiswa";  
    }
   
}
