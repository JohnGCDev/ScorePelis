/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bean_entity;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Pelicula {
    private int id;
    private String nombre;
    private String imagen;
    private String pais;
    private String sinopsis;
    private double puntuacion;
    private Date fechaCine;
    private Date fechaDvd;
    private double precioDvd;

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, String imagen, String pais, String sinopsis, double puntuacion, Date fechaCine, Date fechaDvd, double precioDvd) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.puntuacion = puntuacion;
        this.fechaCine = fechaCine;
        this.fechaDvd = fechaDvd;
        this.precioDvd = precioDvd;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFechaCine() {
        return fechaCine;
    }

    public void setFechaCine(Date fechaCine) {
        this.fechaCine = fechaCine;
    }

    public Date getFechaDvd() {
        return fechaDvd;
    }

    public void setFechaDvd(Date fechaDvd) {
        this.fechaDvd = fechaDvd;
    }

    public double getPrecioDvd() {
        return precioDvd;
    }

    public void setPrecioDvd(double precioDvd) {
        this.precioDvd = precioDvd;
    }
    
}
