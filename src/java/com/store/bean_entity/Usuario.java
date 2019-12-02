/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bean_entity;

/**
 *
 * @author Estilos
 */
public class Usuario {
    private int id;
    private String nombre;
    private String pass;
    private String passrep;
    private int edad;
    private String genero;
    private String descripcion;
    private String rol;
    
    public Usuario(){

    }

    public String getPassrep() {
        return passrep;
    }

    public void setPassrep(String passrep) {
        this.passrep = passrep;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public Usuario(String nombre, String pass, int edad, String genero, String descripcion, String rol) {
        this.nombre = nombre;
        this.pass = pass;
        this.edad = edad;
        this.genero = genero;
        this.descripcion = descripcion;
        this.rol = rol;
    }

    public Usuario(int id, String nombre, String pass, int edad, String genero, String descripcion, String rol) {
        this.id = id; //Within ID !
        this.nombre = nombre;
        this.pass = pass;
        this.edad = edad;
        this.genero = genero;
        this.descripcion = descripcion;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}

