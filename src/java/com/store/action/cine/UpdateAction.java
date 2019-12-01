/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cine;

import com.store.bean_entity.Cine;
import com.store.dao.CineDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class UpdateAction {
    private int id;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String msg ;
    private  String submitType="";
    private int ctr=0;
    List<Cine> beanList=null;
    CineDAO dao=new CineDAO();
    public UpdateAction() {
    }
    
    public String execute() throws Exception {
      try {
            if (submitType.equals("updatedata")) {
           
                beanList=dao.BuscarCine(id);
                
                int tam=beanList.size();
                
                if (tam>0) {
                    id=beanList.get(0).getId();
                    nombre=beanList.get(0).getNombre();
                    ciudad=beanList.get(0).getCiudad();
                    direccion=beanList.get(0).getDireccion();
                }else{
                     msg = "No existe el registro";
                }
                
            } else {
                ctr = dao.EditarCine(id, nombre,ciudad,direccion);
                if (ctr > 0) {
                    msg = "Cine actualizado correctamente";
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
