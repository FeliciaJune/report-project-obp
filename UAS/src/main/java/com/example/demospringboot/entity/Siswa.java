package com.example.demospringboot.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "siswa")
public class Siswa {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int nisn;

@Column(name = "name")
private String nama;
@Column(name = "kelas")
private int kelas;
public Siswa() {}
public Siswa(int nisn, String nama, int kelas) {
this.nisn = nisn;
this.nama = nama;
this.kelas = kelas;
}

public int getNisn() {
    return nisn;
}

public void setNisn(int nisn) {
    this.nisn = nisn;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public int getKelas() {
    return kelas;
}

public void setKelas(int kelas) {
    this.kelas = kelas;
}

}