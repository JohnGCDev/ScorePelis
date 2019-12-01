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
public class DeleteAction extends ActionSupport{
    private int id;
    private String msg;
    private int ctr;
     GeneroDAO dao=new GeneroDAO();
    public DeleteAction() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            ctr = dao.EliminarGenero(id);
            if (ctr > 0) {
                msg = "Género Eliminado Correctamente";
            } else {
                msg = "Ocurrio un error al eliminar el Género";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETE";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
