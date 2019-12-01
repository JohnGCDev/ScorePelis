/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action;

import com.store.dao.UsuarioDAO;
import java.sql.SQLException;

/**
 *
 * @author Estilos
 */
public class DeleteAction {
    int id;
    String msg;
    String submitType;

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
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
    
    
     public String Eliminar() throws Exception {
      UsuarioDAO dao= new UsuarioDAO();
      
      
		try {

                    int resp=  dao.EliminaUsuario(id);
                            if(resp>0){
                             msg="ELIMINACION CORRECTA: -->"+resp;
                            }else{
                              msg="ERROR AL ELIMINAR-->"+resp;  
                            }

                            
		} catch (SQLException e) {
			e.printStackTrace();
		}
               return "ELIMINAR";
                
		
	}
}
