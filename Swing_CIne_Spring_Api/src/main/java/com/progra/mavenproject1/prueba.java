
package com.progra.mavenproject1;

public class prueba 
{
    private int id;
    private String nombre;
    
    public prueba(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public prueba() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
