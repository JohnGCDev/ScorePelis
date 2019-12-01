package com.store.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
       private static Conexion instancia;
    
    private Conexion(){};
    
    public static Conexion getInstancia(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
    
    public Connection createConexion(){
        Connection cn =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error no se puede cargar el driver:" + e.getMessage());
        }
        try {
            String url = "jdbc:mysql://localhost:3306/db_peliculas2";
            String user = "root";
            String password = "";
            cn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error no se establecer la conexion:" + e.getMessage());
        }
        return cn;
    }
}

