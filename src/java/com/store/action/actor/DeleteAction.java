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
public class DeleteAction {
    private int id;
    private String msg;
    private int ctr;
     ActorDAO dao=new ActorDAO ();
    public DeleteAction() {
    }
    
    public String execute() throws Exception {
          try {
            ctr = dao.EliminarActor(id);
            if (ctr > 0) {
                msg = "Actor Eliminado Correctamente";
            } else {
                msg = "Ocurrio un error al eliminar el Actor, Verifique que no tenga peliculas asignadas";
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
