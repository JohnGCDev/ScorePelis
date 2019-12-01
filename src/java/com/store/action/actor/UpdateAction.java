/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.actor;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Actor;
import com.store.dao.ActorDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class UpdateAction extends ActionSupport{
    private int id;
    private String nombre;
    private String nacionalidad;
    private String msg ;
    private  String submitType="";
    private int ctr=0;
    List<Actor> beanList=null;
    ActorDAO dao=new ActorDAO();
    public UpdateAction() {
    }
    
    public String execute() throws Exception {
        try {
            if (submitType.equals("updatedata")) {
           
                beanList=dao.BuscarActor(id);
                
                int tam=beanList.size();
                
                if (tam>0) {
                    id=beanList.get(0).getId();
                    nombre=beanList.get(0).getNombre();
                    nacionalidad=beanList.get(0).getNacionalidad();
                }else{
                     msg = "No existe el registro";
                }
                
            } else {
                ctr = dao.EditarActor(id, nombre,nacionalidad);
                if (ctr > 0) {
                    msg = "Actor actualizado correctamente";
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
