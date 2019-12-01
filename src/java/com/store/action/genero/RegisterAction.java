/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.genero;

import com.opensymphony.xwork2.ActionSupport;
import com.store.dao.GeneroDAO;

/**
 *
 * @author HP
 */
public class RegisterAction extends ActionSupport{
   private String nombre;
    private String msg ;
    private int ctr;
     GeneroDAO dao=new GeneroDAO();
    public RegisterAction() {
    }
    
   @Override
    public String execute() throws Exception {
        try {
            ctr = dao.nuevoGenero(nombre);
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
