/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dao;

import com.store.bean_entity.Cine;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CineDAO {
    public static CineDAO instancia;
    private Connection cnn;
    public CineDAO() {
    }
    public static CineDAO getInstancia(){
        if(instancia == null)
            instancia = new CineDAO();
        return instancia;
    }
public int nuevoCine(String nombre,String ciudad,String direccion) throws SQLException {
         int Respuesta=-1;
    cnn = Conexion.getInstancia().createConexion();
    try {
         String sql="CALL sp_cine_crud(0,?,?,?,?)";
        CallableStatement cst=cnn.prepareCall(sql);
            cst.setString(1, nombre);
            cst.setString(2, ciudad);
             cst.setString(3, direccion);
            cst.setInt(4, 1);
            Respuesta=cst.executeUpdate();
            return Respuesta;
    } catch (SQLException ex) {
            
            System.out.println("ERROR: " + ex.getMessage());
           return -1;
    } finally {
        cnn.close();
    }
    }
public int EditarCine(int id, String nombre,String ciudad,String direccion) throws SQLException {

int respuesta=0;       
    try {
         String sql="CALL sp_cine_crud(?,?,?,?,2)";
         cnn = Conexion.getInstancia().createConexion();
            CallableStatement  cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nombre);   
            cst.setString(3, ciudad);
            cst.setString(4, direccion);
            respuesta= cst.executeUpdate();
            return respuesta ;
   
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return -1;

    } finally {
        cnn.close();
    }

    }
public int EliminarCine(int id) throws SQLException {
    int respuesta=0;
    cnn = Conexion.getInstancia().createConexion();
   
    try {
         String sql="CALL sp_cine_crud(?,'','','',?)";
         CallableStatement cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
            cst.setInt(2, 3);
         respuesta=cst.executeUpdate();
         return respuesta;
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
           return -1;
    } finally {
        cnn.close();
    }
}
public List<Cine> ListarCines() throws SQLException {
        Cine bean=null;
    List<Cine> beanList=new ArrayList<>();
        ResultSet rs;
        CallableStatement cstm;
    
        //ArrayList listadoGeneros = new ArrayList();

        try {
            cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_cine_crud(0,'','','',4)";
            cstm = cnn.prepareCall(sql);
            //cstm.setInt(1, 4);
            rs = cstm.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                   
                    bean = new Cine();
                    bean.setId(rs.getInt(1));
                    bean.setNombre(rs.getString(2));
                    bean.setCiudad(rs.getString(3));
                    bean.setDireccion(rs.getString(4));
                    beanList.add(bean);
                }
            }
            //System.out.println("Éxito listado dao ----> ListarUsuarios ");
        return beanList;
        } catch (SQLException e) {

            System.out.println("Error listado GeneroDAO" + e.getMessage());
            return null;
        } finally {
            cnn.close();
        }
       
    }
public List<Cine> BuscarCine(int id) throws SQLException {
    Cine bean=null;
    List<Cine> beanList=new ArrayList<>();
        ResultSet rs;
        CallableStatement cstm;
        //ArrayList listadoGeneros = new ArrayList();

        try {
           
            cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_cine_crud(?,'','','',5)";
            cstm = cnn.prepareCall(sql);
            cstm.setInt(1, id);
            //cstm.setInt(1, 4);
            rs = cstm.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                   
                    bean = new Cine();
                    bean.setId(rs.getInt(1));
                    bean.setNombre(rs.getString(2));
                    bean.setCiudad(rs.getString(3));
                    bean.setDireccion(rs.getString(4));
                    beanList.add(bean);
                }
            }
            //System.out.println("Éxito listado dao ----> ListarUsuarios ");
        return beanList;
        } catch (SQLException e) {

            System.out.println("Error listado DirectorDAO" + e.getMessage());
            return null;
        } finally {
            cnn.close();
        }
       
    }
}
