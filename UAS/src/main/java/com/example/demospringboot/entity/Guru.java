
package com.example.demospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "guru")
public class Guru {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "idGuru")
    private int idGuru;

    @Column(name = "namaGuru") 
    private String namaGuru;

    @Column(name = "pelajaran") 
    private String pelajaran;

    public Guru(String namaGuru, String pelajaran) {
        this.namaGuru = namaGuru;
        this.pelajaran = pelajaran;
    }

    public int getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public String getNamaGuru() {
        return namaGuru;
    }

    public void setNamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }
}