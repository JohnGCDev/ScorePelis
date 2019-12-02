/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.login;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Usuario;
import com.store.dao.UsuarioDAO;
import java.sql.SQLException;

/**
 *
 * @author JD
 */
public class Login extends ActionSupport {
    private UsuarioDAO usuDAO = new UsuarioDAO();
    private Usuario usu;
    
    private String email;
    private String pass;
    private String nombres;
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @Override
    public String execute() throws SQLException{
        usu = usuDAO.login(email, pass);
        
        if(usu != null){
            nombres = usu.getDescripcion();
            rol = usu.getRol();
            return SUCCESS;
        }else{
            return INPUT;
        }
        
    }
}
