package com.store.dao;

import com.store.bean_entity.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class UsuarioDAO {
private static UsuarioDAO instancia;
    private Connection cnn;
    private ResultSet rs;
    
    public UsuarioDAO(){}
    
    public static UsuarioDAO getInstancia(){
        if(instancia == null)
            instancia = new UsuarioDAO();
        return instancia;
    }
   
   

    
    public boolean nuevoUsuario(String nom,  String contraseña,int edad, String genero) throws SQLException {
//String nom, int edad, String genero, String contraseña
         boolean Respuesta;
    cnn = Conexion.getInstancia().createConexion();
    //PreparedStatement ps=null;
   
    try {
         String sql="CALL sp_insertar_usuario(?,?,?,?)";
        CallableStatement cst=cnn.prepareCall(sql);
            cst.setString(1, nom);
            cst.setString(2, contraseña);
            cst.setInt(3, edad );
            cst.setString(4, genero);
            cst.execute();
            Respuesta=true;
            return Respuesta;
    } catch (SQLException ex) {
            Respuesta=false;
            System.out.println("ERROR: " + ex.getMessage());
           return Respuesta;
    } finally {
        cnn.close();
    }
    }

    
     public boolean nuevoAdmin(String nom,  String contraseña,int edad, String genero) throws SQLException {
//String nom, int edad, String genero, String contraseña
         boolean Respuesta;
    cnn = Conexion.getInstancia().createConexion();
    //PreparedStatement ps=null;
   
    try {
         String sql="CALL sp_insertar_admin(?,?,?,?)";
        CallableStatement cst=cnn.prepareCall(sql);
            cst.setString(1, nom);
            cst.setString(2, contraseña);
            cst.setInt(3, edad );
            cst.setString(4, genero);
            cst.execute();
            Respuesta=true;
            return Respuesta;
    } catch (SQLException ex) {
            Respuesta=false;
            System.out.println("ERROR: " + ex.getMessage());
           return Respuesta;
    } finally {
        cnn.close();
    }
    }
     
     
public int EditarUsuario(int id, String nom, int edad, 
                            String genero,String des) throws SQLException {

int respuesta=-2;       
    try {
         String sql="CALL sp_editar_usuario(?,?,?,?,?)";
         cnn = Conexion.getInstancia().createConexion();
            CallableStatement  cst=cnn.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nom);
            cst.setInt(3, edad );
            cst.setString(4, genero);
            cst.setString(5, des);       
            respuesta= cst.executeUpdate();
            return respuesta ;
   
    } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return -1;

    } finally {
        cnn.close();
    }

    }


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


    public ArrayList ListarUsuarios() throws Exception {
        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;
        ArrayList listadoUsuarios = new ArrayList();
        
        try{
           cnn = Conexion.getInstancia().createConexion();
            String sql = "CALL sp_listarUsuarios()";
            cstm = cnn.prepareCall(sql);
            rs = cstm.executeQuery();
            while(rs.next()){
                Usuario us = new Usuario();
                //los numeros de indices son los mismos en
                //el orden que aparecen el el procedure
                us.setId(rs.getInt(1));
                us.setNombre(rs.getString(2));
                us.setEdad(rs.getInt(4));
                us.setGenero(rs.getString(5));
                us.setDescripcion(rs.getString(6));
                listadoUsuarios.add(us);
            }
            System.out.println("Éxito listado dao ----> ListarUsuarios ");
            
        }catch(SQLException e){
            System.out.println("Error listado UsuarioDAO"+e.getMessage());
        }
        return listadoUsuarios;
    }


  public List datos_usuario_por_id(int id) throws SQLException, Exception {

                List listadoUsuarios = new ArrayList();
		try {
                    cnn = Conexion.getInstancia().createConexion();
			String sql = "SELECT idUsuario, us_nombre, us_edad, us_genero, us_descripcion, idRol FROM usuario WHERE idUsuario=?";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
                            Usuario us = new Usuario();
                            us.setId(rs.getInt(1));
                            us.setNombre(rs.getString(2));
                            us.setEdad(rs.getInt(3));
                            us.setGenero(rs.getString(4));
                            us.setDescripcion(rs.getString(5));
                            listadoUsuarios.add(us);
                        }
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			cnn.close();
		}
                return listadoUsuarios;
	}  
}
