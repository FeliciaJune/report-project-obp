package com.example.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nilai")  
public class Nilai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "nisn")
    private int nisn;

    @Column(name = "id_guru")
    private int idGuru;

    @Column(name = "nama")
    private String nama;

    @Column(name = "pelajaran")
    private String pelajaran;

    @Column(name = "nilai")
    private int nilai;

    @Column(name = "semester")
    private String semester;

    // Default constructor
    public Nilai() {}

    public Nilai(int idGuru, String nama, String pelajaran, int nilai, String semester) {
        this.idGuru = idGuru;
        this.nama = nama;
        this.pelajaran = pelajaran;
        this.nilai = nilai;
        this.semester = semester;
    }

    // Getters and setters
    public int getNisn() {
        return nisn;
    }

    public void setNisn(int nisn) {
        this.nisn = nisn;
    }

    public int getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
