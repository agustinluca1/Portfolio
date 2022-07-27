package com.portfolioluca.luca.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreAb;
    private String descripcionAb;
    
    //Constructor

    public About() {
    }

    public About(String nombreAb, String descripcionAb) {
        this.nombreAb = nombreAb;
        this.descripcionAb = descripcionAb;
    }
    
    //Get&Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAb() {
        return nombreAb;
    }

    public void setNombreAb(String nombreAb) {
        this.nombreAb = nombreAb;
    }

    public String getDescripcionAb() {
        return descripcionAb;
    }

    public void setDescripcionAb(String descripcionAb) {
        this.descripcionAb = descripcionAb;
    }
    
    
}
