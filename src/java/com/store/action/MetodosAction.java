package com.store.action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.store.bean_entity.Usuario;

import com.store.dao.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodosAction extends ActionSupport {
   //-----------------------------------REGISTRAR USUARIO--------------------------------------
   //ESTOS SON LOS MISMOS NOMBRES QUE LE PONEMOS EN EL FORMULARIO
    String nombre;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    int edad;
    String pass;
    String genero;
    String passrep;
    String descripcion;
     List<Usuario> listarUsuarios = null;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public List<Usuario> getListarUsuarios() {
        return listarUsuarios;
    }

    public void setListarUsuarios(List<Usuario> listarUsuarios) {
        this.listarUsuarios = listarUsuarios;
    }

    public String getPassrep() {
        return passrep;
    }

    public void setPassrep(String passrep) {
        this.passrep = passrep;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGenero() {
        return genero;
    }

    //private Usuario us= new Usuario();
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    @Override
   public void validate(){
       if (nombre.equals("")){
           addFieldError("fnombre", "Ingrese nombre");
       }
       if(genero.equals("")){
           addFieldError("fgenero", "Seleccione genero");
       }
       if(edad<10){
           addFieldError("fedad", "La edad mínima es 10 años");
       }
       if(pass.equals("")){
           addFieldError("fpass", "Ingrese Contraseña");
       }
       if(passrep.equals("")){
           addFieldError("fpassr", "Repita Contraseña");
       }
       
       
   }
   
   
 
    public String nuevoUsuario() throws Exception {
        //CREAMOS UNA REFERENCIA DEL OBJETO
        Usuario us=new Usuario();
        us.setNombre(nombre);
        us.setGenero(genero);
        us.setEdad(edad);
        us.setPass(pass);
        us.setPassrep(passrep);
        //CREAMOS LA SESSION
       /* Map<String, Object>sesionUsuario = ActionContext.getContext().getSession();
        sesionUsuario.put("sesionUsuario", us.getNombre());*/

        //COMPARAMOS QUE AMBAS CONTRASEÑAS SEAN IGUALES
         if (us.getPass().equals(us.getPassrep())) {
             if (UsuarioDAO.getInstancia().nuevoUsuario(us.getNombre(),us.getPass(),us.getEdad(),us.getGenero())==true ){
               return SUCCESS;
             }else{
                return  ERROR;
             }
         }else{
                 return "DIFERENTES";
         }      
    }
    
   public String nuevoAdmin() throws Exception {
      //CREAMOS UNA REFERENCIA DEL OBJETO
   Usuario us=new Usuario();
   us.setNombre(nombre);
   us.setGenero(genero);
   us.setEdad(edad);
   us.setPass(pass);
   us.setPassrep(passrep);
   //CREAMOS LA SESSION
  /* Map<String, Object>sesionUsuario = ActionContext.getContext().getSession();
   sesionUsuario.put("sesionUsuario", us.getNombre());*/

   //COMPARAMOS QUE AMBAS CONTRASEÑAS SEAN IGUALES
    if (us.getPass().equals(us.getPassrep())) {
        if (UsuarioDAO.getInstancia().nuevoAdmin(us.getNombre(),us.getPass(),us.getEdad(),us.getGenero())==true ){
          return SUCCESS;
        }else{
           return  ERROR;
        }
    }else{
            return "DIFERENTES";
    }      
    } 
   
   
    
    
    
    
    
    
    
    public static List<Usuario> ListarUsuarios()throws Exception{
       UsuarioDAO us= new UsuarioDAO();
        return us.ListarUsuarios();
   }

 
     
     
  
    @Override
     public String  execute()  {
     
     return null;
     }
    
}
