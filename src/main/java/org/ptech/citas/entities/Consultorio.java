package org.ptech.citas.entities;

public class Consultorio {
    private int id;
    private String dirreccion;
     private int numero;
    
    
     public Consultorio() {
    }


    public Consultorio(int id, String dirreccion, int numero) {
        this.id = id;
        this.dirreccion = dirreccion;
        this.numero = numero;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDirreccion() {
        return dirreccion;
    }


    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    } 

     

}
