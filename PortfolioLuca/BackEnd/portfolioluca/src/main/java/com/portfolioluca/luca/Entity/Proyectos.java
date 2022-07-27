package com.portfolioluca.luca.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePr;
    private String descripcionPr;
    private LocalDate fechaPr;
    
    //Const

    public Proyectos() {
    }

    public Proyectos(String nombrePr, String descripcionPr, LocalDate fechaPr) {
        this.nombrePr = nombrePr;
        this.descripcionPr = descripcionPr;
        this.fechaPr = fechaPr;
    }
    
    //Get&Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePr() {
        return nombrePr;
    }

    public void setNombrePr(String nombrePr) {
        this.nombrePr = nombrePr;
    }

    public String getDescripcionPr() {
        return descripcionPr;
    }

    public void setDescripcionPr(String descripcionPr) {
        this.descripcionPr = descripcionPr;
    }

    public LocalDate getFechaPr() {
        return fechaPr;
    }

    public void setFechaPr(LocalDate fechaPr) {
        this.fechaPr = fechaPr;
    }
    
    
}
