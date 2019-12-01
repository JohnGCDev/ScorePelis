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
public class DeleteAction {
    private int id;
    private String msg;
    private int ctr;
    CineDAO dao =new CineDAO();
    public DeleteAction() {
    }
    
    public String execute() throws Exception {
         try {
            ctr = dao.EliminarCine(id);
            if (ctr > 0) {
                msg = "Cine Eliminado Correctamente";
            } else {
                msg = "Ocurrio un error al eliminar el Actor, Verifique que no tenga cartelera asignada";
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
