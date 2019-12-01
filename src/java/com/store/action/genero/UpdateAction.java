/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.genero;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Genero;
import com.store.dao.GeneroDAO;
import java.util.List;

/**
 *
 * @author HP
 */
public class UpdateAction extends ActionSupport{
    private int id;
    private String nombre;
    private String msg ;
    private  String submitType="";
    private int ctr=0;
    List<Genero> beanList=null;
    GeneroDAO dao=new GeneroDAO();
    public UpdateAction() {
    }
    
    public String execute() throws Exception {
        try {
            if (submitType.equals("updatedata")) {
           
                beanList=dao.BuscarGenero(id);
                
                int tam=beanList.size();
                
                if (tam>0) {
                    id=beanList.get(0).getId();
                    nombre=beanList.get(0).getNombre();
                }else{
                     msg = "No existe el registro";
                }
                
            } else {
                ctr = dao.EditarGenero(id, nombre);
                if (ctr > 0) {
                    msg = "Género actualizado correctamente";
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

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
    
    
}
