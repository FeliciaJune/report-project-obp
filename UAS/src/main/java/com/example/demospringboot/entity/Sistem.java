package com.example.demospringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public abstract class Sistem {
    
    @Id
    private String username;
    private String password;

    // Konstruktor default 
    public Sistem() {
    }

    // Konstruktor dengan parameter
    public Sistem(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Abstract method
    public abstract void masuk();

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
