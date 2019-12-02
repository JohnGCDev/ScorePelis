/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cartelera;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Cartelera;
import com.store.dao.CarteleraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estilos
 */
public class ListAction extends ActionSupport{
    List<Cartelera> beanList=null;
    CarteleraDAO dao=new CarteleraDAO();
    private boolean noData = false;
    
    public ListAction() {
    }
    
       @Override
    public String execute() throws Exception {
        try {
            beanList = new ArrayList<>();
            beanList=dao.ListarCartelera();
            
            if (beanList.size() > 0) {
                noData = true;
            } 
        } catch (SQLException e) {
        }
        return "REPORT";
    }
    
       public boolean isNoData() {
        return noData;
    }

    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    public List<Cartelera> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Cartelera> beanList) {
        this.beanList = beanList;
    }
    
}
