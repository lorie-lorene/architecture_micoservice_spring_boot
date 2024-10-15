package com.m1_fonda.service_users.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserBank {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;
    private String username;
    private String surname;
    private String cni;
    private String passWord;
    private String email;
    private  String numero;

    public UserBank ( int id,String username,String surname,String cni,
                 String passWord, String email, String numero){

    }
    public  UserBank(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCni() {
        return cni;
    }
    public void setCni(String cni) {
        this.cni = cni;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
