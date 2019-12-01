/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dao;

import com.store.bean_entity.Pelicula;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class PeliculaDAO {
    public static PeliculaDAO instancia;
    private Connection cnn;
    public static PeliculaDAO getInstancia(){
         if(instancia == null)
            instancia = new PeliculaDAO();
        return instancia;
    }
    public PeliculaDAO() {
    }
public int nuevaPelicula(String nombre,String pais,String imagen,String sinopsis,double puntuacion,Date fechaCine,Date fechaDvd,Double precio) throws SQLException {
         int Respuesta=-1;
    cnn = Conexion.getInstancia().createConexion();
    try {
         String sql="CALL sp_pelicula_crud(0,?,?,?,?,?,?,?,?,?)";
        CallableStatement cst=cnn.prepareCall(sql);
            cst.setString(1, nombre);
            cst.setString(2, pais);
            cst.setString(3, imagen);
            cst.setString(4, sinopsis);
            cst.setDouble(5, puntuacion);
            cst.setDate(6,  fechaCine);
            cst.setDate(7, fechaDvd);
            cst.setDouble(8, precio);
            cst.setInt(9, 1);
            Respuesta=cst.executeUpdate();
            return Respuesta;
    } catch (SQLException ex) {
            
            System.out.println("ERROR: " + ex.getMessage());
           return -1;
    } finally {
        cnn.close();
    }
    }
public int EditarPelicula(int id, String nombre,String pais,String imagen,String sinopsis,double puntuacion,Date fechaCine,Date fechaDvd,Double precio) throws SQLException {
int respuesta=0;       
    try {
         String sql="CALL sp_pelicula_crud(?,?,?,?,?,?,?,?,?,2)";
         cnn = Conexion.getInstancia().createConexion();
            CallableStatement  cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nombre);   
            cst.setString(3, pais);
            cst.setString(4, imagen);
            cst.setString(5, sinopsis);
            cst.setDouble(6, puntuacion);
            cst.setDate(7, fechaCine);
            cst.setDate(8, fechaDvd);
            cst.setDouble(9, precio);
                
            respuesta= cst.executeUpdate();
            return respuesta ;
   
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return -1;

    } finally {
        cnn.close();
    }

    }
public int EliminarPelicula(int id) throws SQLException {
    int respuesta=0;
    cnn = Conexion.getInstancia().createConexion();
   
    try {
         String sql="CALL sp_pelicula_crud(?,'','','','','','','','',?)";
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
public List<Pelicula> ListarPeliculas() throws SQLException {
        Pelicula bean=null;
    List<Pelicula> beanList=new ArrayList<>();
        ResultSet rs;
        CallableStatement cstm;
    
        //ArrayList listadoGeneros = new ArrayList();

        try {
            cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_pelicula_crud(0,'','','','',0,'2019-11-11 00:00:00.000000','2019-11-11 00:00:00.000000',0,4)";
            cstm = cnn.prepareCall(sql);
            //cstm.setInt(1, 4);
            rs = cstm.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                   
                    bean = new Pelicula();
                    bean.setId(rs.getInt(1));
                    bean.setNombre(rs.getString(2));
                    bean.setPais(rs.getString(3));
                    bean.setImagen(rs.getString(4));
                    bean.setSinopsis(rs.getString(5));
                    bean.setPuntuacion(rs.getDouble(6));
                    bean.setFechaCine(rs.getDate(7));
                    bean.setFechaDvd(rs.getDate(8));
                    bean.setPrecioDvd(rs.getDouble(9));
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
public List<Pelicula> BuscarPelicula(int id) throws SQLException {
    Pelicula bean=null;
    List<Pelicula> beanList=new ArrayList<>();
        ResultSet rs;
        CallableStatement cstm;
        //ArrayList listadoGeneros = new ArrayList();

        try {
           
            cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_pelicula_crud(?,'','','','',0,'2019-11-11 00:00:00.000000','2019-11-11 00:00:00.000000',0,5)";
            cstm = cnn.prepareCall(sql);
            cstm.setInt(1, id);
            //cstm.setInt(1, 4);
            rs = cstm.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                   
                    bean = new Pelicula();
                    bean.setId(rs.getInt(1));
                    bean.setNombre(rs.getString(2));
                    bean.setPais(rs.getString(3));
                    bean.setImagen(rs.getString(4));
                    bean.setSinopsis(rs.getString(5));
                    bean.setPuntuacion(rs.getDouble(6));
                    bean.setFechaCine(rs.getDate(7));
                    bean.setFechaDvd(rs.getDate(8));
                    bean.setPrecioDvd(rs.getDouble(9));
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
