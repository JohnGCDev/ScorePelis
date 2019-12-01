/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.action.director;

import com.store.bean_entity.Director;
import com.store.dao.DirectorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ListAction {
     List<Director> beanList=null;
    DirectorDAO dao=new DirectorDAO();
    private boolean noData = false;
    public ListAction() {
    }
    
    public String execute() throws Exception {
        try {
            beanList = new ArrayList<>();
            
            beanList=dao.ListarDirector();
            
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

    public List<Director> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Director> beanList) {
        this.beanList = beanList;
    }

}
