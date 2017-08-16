
package com.progra.mavenproject1;

public class pelicula 
{

    public pelicula() {
    
    }

       
    public pelicula(int id_presentacion, String nombre, String categoria, String idioma, String hora, String num_sala, String ima) {
        this.id_presentacion = id_presentacion;
        this.nombre = nombre;
        this.categoria = categoria;
        this.idioma = idioma;
        this.hora = hora;
        this.num_sala = num_sala;
        this.ima = ima;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    public int getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    private int id_presentacion;
    private String nombre;
    private String categoria;
    private String idioma;
    private String hora;
    private String num_sala;
    private String ima;
    



}
