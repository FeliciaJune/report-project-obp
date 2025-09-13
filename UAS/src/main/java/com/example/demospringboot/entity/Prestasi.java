package com.example.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestasi")
public class Prestasi {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String nisn;

    @Column(name = "jenis", nullable = false)
    private String jenis;

    @Column(name = "tingkat", nullable = false)
    private String tingkat;

    @Column(name = "peringkat", nullable = false)
    private int peringkat;

    @Column(name = "deskripsi", nullable = false)
    private String deskripsi;

    @Column(name = "tahun", nullable = false)
    private int tahun;
   
    public Prestasi() {}

    public Prestasi(String nisn, String jenis, String tingkat, int peringkat, String deskripsi, int tahun) {
        this.nisn = nisn;
        this.jenis = jenis;
        this.tingkat = tingkat;
        this.peringkat = peringkat;
        this.deskripsi = deskripsi;
        this.tahun = tahun;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTingkat() {
        return tingkat;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    public int getPeringkat() {
        return peringkat;
    }

    public void setPeringkat(int peringkat) {
        this.peringkat = peringkat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
