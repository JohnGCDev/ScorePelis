/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.pelicula;

import com.store.bean_entity.Pelicula;
import com.store.dao.PeliculaDAO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class UpdateAction {
    private int id;
    private String nombre,pais,imagen,sinopsis;
    private Date fechaCine,fechaDvd;
    private double precioDvd,puntuacion;
    private String msg ;
    private  String submitType="";
    private int ctr=0;
    List<Pelicula> beanList=null;
    PeliculaDAO dao=new PeliculaDAO();
    public UpdateAction() {
    }
    
    public String execute() throws Exception {
        try {
            if (submitType.equals("updatedata")) {
           
                beanList=dao.BuscarPelicula(id);
                
                int tam=beanList.size();
                
                if (tam>0) {
                    id=beanList.get(0).getId();
                    nombre=beanList.get(0).getNombre();
                    pais=beanList.get(0).getPais();
                    imagen=beanList.get(0).getImagen();
                    sinopsis=beanList.get(0).getSinopsis();
                    puntuacion=beanList.get(0).getPuntuacion();
                    fechaCine=(Date) beanList.get(0).getFechaCine();
                    fechaDvd=(Date) beanList.get(0).getFechaDvd();
                    precioDvd=beanList.get(0).getPrecioDvd();
                }else{
                     msg = "No existe el registro";
                }
                
            } else {
                ctr = dao.EditarPelicula(id, nombre, pais, imagen, sinopsis, puntuacion, fechaCine, fechaDvd, precioDvd);
                if (ctr > 0) {
                    msg = "Película actualizada correctamente";
                } else {
                    msg = "Ocurrio un error en la actualización";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";
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

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }
    
}
