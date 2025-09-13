package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Nilai;
import com.example.demospringboot.service.NilaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class NilaiController {

    @Autowired
    private NilaiService nilaiService;

    // Submit Nilai
    @PostMapping("/submitnilai")
    public String submitNilai(@RequestParam String nama,
                               @RequestParam String pelajaran,
                               @RequestParam int nilai,
                               @RequestParam String semester,
                               RedirectAttributes redirectAttributes) {

        System.out.println("Form submitted: nama=" + nama + ", pelajaran=" + pelajaran + ", nilai=" + nilai + ", semester=" + semester);

        int idGuru = 1;  // Contoh statis (seharusnya dari session)

        Nilai nilaiData = new Nilai(idGuru, nama, pelajaran, nilai, semester);

        nilaiService.saveNilai(nilaiData);

        redirectAttributes.addFlashAttribute("message", "Data Nilai Berhasil Disimpan!");
        return "redirect:/menuguru2";
    }

    // Cari nilai berdasarkan nama
    @GetMapping("/cariNilai")
    public String cariNilai(@RequestParam("nama") String nama, Model model) {
        List<Nilai> nilaiList = nilaiService.getNilByNama(nama);
        model.addAttribute("nilaiList", nilaiList);
        return "cariNilai";  // Nama template HTML
    }

    // Tampilkan semua nilai
    @GetMapping("/lihatNilai")
    public String lihatNilai(Model model) {
        List<Nilai> nilaiList = nilaiService.getAllNil();
        model.addAttribute("nilaiList", nilaiList);
        return "lihatNilai";  // Nama template HTML
    }
}
