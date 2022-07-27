package com.portfolioluca.luca.Dto;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombrePr;
    @NotBlank
    private String descripcionPr;
    @NotBlank
    private LocalDate fechaPr;
    
    //Const
    public dtoProyectos() {
    }

    public dtoProyectos(String nombrePr, String descripcionPr, LocalDate fechaPr) {
        this.nombrePr = nombrePr;
        this.descripcionPr = descripcionPr;
        this.fechaPr = fechaPr;
    }
    
    //Get&Set

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
