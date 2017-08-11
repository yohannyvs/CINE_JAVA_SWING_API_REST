/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.mavenproject1;

/**
 *
 * @author ADRIA
 */
public class peli {

    public peli(String nom, String cate, String idi, String ima) {
        this.nom = nom;
        this.cate = cate;
        this.idi = idi;
        this.ima = ima;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getIdi() {
        return idi;
    }

    public void setIdi(String idi) {
        this.idi = idi;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }
    
    private String nom;
    private String cate;
    private String idi;
    private String ima;
    
}
