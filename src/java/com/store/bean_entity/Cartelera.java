/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bean_entity;

import java.sql.Time;

/**
 *
 * @author Estilos
 */
public class Cartelera {
    private int idCartelera;
   private int idPelicula;
   private Time carHorario;
   private String cine;
   
   
   private String nombre;
   private String genero;
   private String direccioncine;
   private String ciudad;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccioncine() {
        return direccioncine;
    }

    public void setDireccioncine(String direccioncine) {
        this.direccioncine = direccioncine;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
   
    
public Cartelera(){
    
}

    public Cartelera(int idCartelera, int idPelicula, Time carHorario, String cine) {
        this.idCartelera = idCartelera;
        this.idPelicula = idPelicula;
        this.carHorario = carHorario;
        this.cine = cine;
    }

    public Cartelera(int idPelicula, Time carHorario, String cine) {
        this.idPelicula = idPelicula;
        this.carHorario = carHorario;
        this.cine = cine;
    }

    public int getIdCartelera() {
        return idCartelera;
    }

    public void setIdCartelera(int idCartelera) {
        this.idCartelera = idCartelera;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Time getCarHorario() {
        return carHorario;
    }

    public void setCarHorario(Time carHorario) {
        this.carHorario = carHorario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }
   
   
  
   
   
   
   
}
