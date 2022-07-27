package com.portfolioluca.luca.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAbout {
    @NotBlank
    private String nombreAb;
    @NotBlank
    private String descripcionAb;
    
    //Constructor

    public dtoAbout() {
    }

    public dtoAbout(String nombreAb, String descripcionAb) {
        this.nombreAb = nombreAb;
        this.descripcionAb = descripcionAb;
    }
    
    //Get&Set

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
