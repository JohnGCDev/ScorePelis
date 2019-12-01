/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.cine;

import com.opensymphony.xwork2.ActionSupport;
import com.store.bean_entity.Cine;
import com.store.dao.CineDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ListAction extends ActionSupport{
    List<Cine> beanList=null;
    CineDAO dao=new CineDAO();
     private boolean noData = false;
    public ListAction() {
    }
    
    public String execute() throws Exception {
           try {
            beanList = new ArrayList<>();
            
            beanList=dao.ListarCines();
            
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

    public List<Cine> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Cine> beanList) {
        this.beanList = beanList;
    }

}
