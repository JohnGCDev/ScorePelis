/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action;


import com.store.bean_entity.Usuario;
import com.store.dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estilos
 */
public class ListadoAction  {
    private ArrayList<Usuario> listarUsuarios;

    public ArrayList<Usuario> getListarUsuarios() {
        return listarUsuarios;
    }

    public void setListarUsuarios(ArrayList<Usuario> listarUsuarios) {
        this.listarUsuarios = listarUsuarios;
    }
    
     
      public String ListadoUsuarios() {
       UsuarioDAO us = new UsuarioDAO();
        try {
            listarUsuarios=us.ListarUsuarios();
            
            
        } catch (Exception ex) {
            Logger.getLogger(MetodosAction.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(listarUsuarios.isEmpty()==false){
            return  "EXITO";
         }else{
             return "ERROR";
         }
   }
}
