/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.actor;

import com.store.dao.ActorDAO;

/**
 *
 * @author HP
 */
public class RegisterAction {
    private String nombre;
    private String nacionalidad;
    private String msg ;
    private int ctr;
    ActorDAO dao=new ActorDAO();
    public RegisterAction() {
    }
    
    public String execute() throws Exception {
         try {
            ctr = dao.nuevoActor(nombre,nacionalidad);
            if (ctr > 0) {
                msg = "Género Registrado Correctamente";
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

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }
    
}
