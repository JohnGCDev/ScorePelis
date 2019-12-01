/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action;

import com.store.bean_entity.Usuario;
import com.store.dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Estilos
 */
public class UpdateAction {
   	private String nombre = "", genero = "", descripcion = "";
        private int edad=0,id=0;
        String submitType;
        String msg="";
        

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
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
        
     public String Actualizar() throws Exception {
      UsuarioDAO dao= new UsuarioDAO();
      
      
		try {
			if (submitType.equals("update")) {
                          int resp=  dao.EditarUsuario(id, nombre, edad, genero, descripcion);
                            if(resp>0){
                             msg="ACTUALIZACION CORRECTA";
                            }else{
                              msg="ERROR AL ACTUALIZAR";  
                            }
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
               return "UPDATE";

	}
        
}
