/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dao;

import com.store.bean_entity.Cartelera;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estilos
 */
public class CarteleraDAO {
    private static CarteleraDAO instancia;
    private Connection cnn;
    private ResultSet rs;
    
    public CarteleraDAO(){}
    
    public static CarteleraDAO getInstancia(){
        if(instancia == null)
            instancia = new CarteleraDAO();
        return instancia;
    }
   
   


 

    /*
public int EliminaUsuario(int id) throws SQLException {
    int respuesta=-2;
    cnn = Conexion.getInstancia().createConexion();
   
    try {
         String sql="CALL sp_eliminar_usuario(?)";
         CallableStatement cst=cnn.prepareCall(sql);
         cst.setInt(1, id );
         respuesta=cst.executeUpdate();
         return respuesta;
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
           return -1;
    } finally {
        cnn.close();
    }
}
*/

    public List ListarCartelera() throws Exception {
        Cartelera bean=null;
        List<Cartelera> beanList=new ArrayList<>();
        ResultSet rs;
        CallableStatement cstm;
        try{
           cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_listar_cartelera()";
            cstm = cnn.prepareCall(sql);
            rs = cstm.executeQuery();
            if(rs!=null){
            while(rs.next()){
                bean = new Cartelera();
                //los numeros de indices son los mismos en
                //el orden que aparecen el el procedure
                bean.setIdCartelera(rs.getInt(1));
                bean.setIdPelicula(rs.getInt(2));
                bean.setCarHorario(rs.getTime(3));
                bean.setNombre(rs.getString(4));
                bean.setGenero(rs.getString(5));
                bean.setCine(rs.getString(6));
                bean.setDireccioncine(rs.getString(7));
                bean.setCiudad(rs.getString(8));
                beanList.add(bean);
            }
            }
          
            return beanList;
        }catch(SQLException e){
            System.out.println("Error listado UsuarioDAO"+e.getMessage());
             return null;
        }
        
    }


  public List datos_cartelera_por_id(int id) throws SQLException, Exception {

                List ListadoCartelera = new ArrayList();
                
		try {
                    cnn = Conexion.getInstancia().createConexion();
			String sql = "CALL sp_listarcartelera_por_id(?)";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
                            Cartelera car = new Cartelera();
                            car.setIdCartelera(rs.getInt(1));
                            car.setIdPelicula(rs.getInt(2));
                            car.setCarHorario(rs.getTime(3));
                            car.setNombre(rs.getString(4));
                            car.setGenero(rs.getString(5));
                            car.setCine(rs.getString(6));
                            car.setDireccioncine(rs.getString(7));
                            car.setCiudad(rs.getString(8));
                            ListadoCartelera.add(car);
                        }
                       return ListadoCartelera;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			cnn.close();
		}
                
	}  
  
  
  
  public int EditarCartelera(int id, Time horario) throws SQLException {

int respuesta=0;       
    try {
         String sql="CALL sp_editar_cartelera(?,?)";
         cnn = Conexion.getInstancia().createConexion();
            CallableStatement  cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
            cst.setTime(2, horario);   
            respuesta= cst.executeUpdate();
            return respuesta ;
   
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return -1;

    } finally {
        cnn.close();
    }

    }
  
  
  public int EliminarCartelera(int id) throws SQLException {
    int respuesta=0;
    cnn = Conexion.getInstancia().createConexion();
   
    try {
         String sql="CALL sp_eliminar_cartelera(?)";
         CallableStatement cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
         respuesta=cst.executeUpdate();
         return respuesta;
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
           return -1;
    } finally {
        cnn.close();
    }
}
}
