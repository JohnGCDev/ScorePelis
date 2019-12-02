/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cartelera;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Cartelera;
import com.store.dao.CarteleraDAO;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author Estilos
 */
public class UpdateAction  extends ActionSupport{
       private int id; 
   private String nombre;
   private String cine;
   private String direccioncine;
   private String ciudad;
   private Time carHorario;
   
    private String msg ;
    private  String submitType="";
    private int ctr=0;
     List<Cartelera> beanList=null;
    CarteleraDAO dao=new CarteleraDAO();

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

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public String getDireccioncine() {
        return direccioncine;
    }

    public void setDireccioncine(String direccioncine) {
        this.direccioncine = direccioncine;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Time getCarHorario() {
        return carHorario;
    }

    public void setCarHorario(Time carHorario) {
        this.carHorario = carHorario;
    }

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

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }
   
   public UpdateAction() {
    }
    
   
    public String execute() throws Exception {
        try {
            if (submitType.equals("updatedata")) {
           
                beanList=dao.datos_cartelera_por_id(id);
                
                int tam=beanList.size();
                
                if (tam>0) {
                    id=beanList.get(0).getIdCartelera();
                    nombre=beanList.get(0).getNombre();
                    cine=beanList.get(0).getCine();
                    direccioncine=beanList.get(0).getDireccioncine();
                    ciudad=beanList.get(0).getCiudad();
                    carHorario=beanList.get(0).getCarHorario();
                    
                }else{
                     msg = "No existe el registro";
                }
                
            } else {
                ctr = dao.EditarCartelera(id, carHorario);
                if (ctr > 0) {
                    msg = "Cartelera actualizada correctamente";
                } else {
                    msg = "Ocurrio un error en la actualización-->"+ctr;
                    
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";

    } 
}
