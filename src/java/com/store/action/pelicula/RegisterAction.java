/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.pelicula;

import com.store.dao.PeliculaDAO;
import java.sql.Date;

/**
 *
 * @author HP
 */
public class RegisterAction {
    private String nombre,pais,imagen,sinopsis;
    private Date fechaCine,fechaDvd;
    private double precioDvd,puntuacion;
    private String msg ;
    private int ctr;
    PeliculaDAO dao=new PeliculaDAO();
    public RegisterAction() {
    }
    
    public String execute() throws Exception {
        try {
            ctr = dao.nuevaPelicula(nombre, pais, imagen, sinopsis, puntuacion, fechaCine, fechaDvd, precioDvd);
            if (ctr > 0) {
                msg = "Pelicula Registrada Correctamente";
            } else {
                msg = "Ocurrio un error al Registrar el género";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REGISTER";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public Double getPrecioDvd() {
        return precioDvd;
    }

    public void setPrecioDvd(Double precioDvd) {
        this.precioDvd = precioDvd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }
    
}
