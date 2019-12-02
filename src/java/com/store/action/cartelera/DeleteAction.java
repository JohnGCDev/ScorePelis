/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cartelera;

import com.store.dao.CarteleraDAO;

/**
 *
 * @author Estilos
 */
public class DeleteAction {
     private int id;
    private String msg;
    private int ctr;
    CarteleraDAO dao = new CarteleraDAO();
    public DeleteAction() {
    } 
    
    public String execute() throws Exception {
          try {
            ctr = dao.EliminarCartelera(id);
            if (ctr > 0) {
                msg = "Cartelera Eliminada Correctamenta";
            } else {
                msg = "Ocurrio un error al eliminar la Cartelera";
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
