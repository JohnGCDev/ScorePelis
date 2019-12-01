/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Usuario;
import com.store.dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Estilos
 */
public class ListarUsuarioAction  {
   	private String nombre = "", genero = "", descripcion = "";
        private int edad=0,id=0;

 
	UsuarioDAO dao = new UsuarioDAO();
	String submitType;
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

  

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
        
            
  public String listar() throws Exception {
      List<Usuario> lista = null;
      UsuarioDAO dao= new UsuarioDAO();
      
      
		try {
                    lista=dao.datos_usuario_por_id(id);
			if (submitType.equals("obtenerusuario")) {
                           for(int i=0 ;i<lista.size();i++){
                           nombre=lista.get(i).getNombre();
                           edad=lista.get(i).getEdad();
                           genero=lista.get(i).getGenero();
                           descripcion=lista.get(i).getDescripcion();
                           }
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
               return "LISTAR";
                
		
	}
  
 

}
