/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.genero;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.store.bean_entity.Genero;
import com.store.dao.GeneroDAO;
import java.sql.SQLException;
/**
 *
 * @author Junior
 */
public class ListAction extends ActionSupport{
 
    List<Genero> beanList=null;
    GeneroDAO dao=new GeneroDAO();
    private boolean noData = false;
    public ListAction() {
    }
    
    @Override
    public String execute() throws Exception {
        try {
            beanList = new ArrayList<>();
            
            beanList=dao.ListarGeneros();
            
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

    public List<Genero> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Genero> beanList) {
        this.beanList = beanList;
    }

}
