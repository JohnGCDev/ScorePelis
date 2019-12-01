/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cine;

import com.store.dao.CineDAO;

/**
 *
 * @author HP
 */
public class RegisterAction {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String msg ;
    private int ctr;
    CineDAO dao=new CineDAO();
    public RegisterAction() {
    }
    
    public String execute() throws Exception {
      try {
            ctr = dao.nuevoCine(nombre,ciudad,direccion);
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
