/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_herencia2;

/**
 *
 * @author Salid
 */
public class Empleado {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;
    private int claveDeEmpleado;
    
    public Empleado(){
        nombre = "vacio";
        ApellidoPaterno = "vacio";
        ApellidoMaterno = "vacio";
        edad = 0;
        rfc = "vacio";
        claveDeEmpleado = 0;
    }
    
    public Empleado(String nombre, String ApellidoPaterno, String ApellidoMaterno, int edad, String rfc, int claveDeEmpleado){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
        this.claveDeEmpleado = claveDeEmpleado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoPaterno(){
        return this.ApellidoPaterno;
    }
    public void setApellidoPaterno(String ApellidoPaterno){
        this.ApellidoPaterno = ApellidoPaterno;
    }
    public String getApellidoMaterno(){
        return this.ApellidoMaterno;
    }
    public void setApellidoMaterno(String ApellidoMaterno){
        this.ApellidoMaterno = ApellidoMaterno;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getRFC(){
        return this.rfc;
    }
    public void setRFC(String rfc){
        this.rfc = rfc;
    }
    public int claveDeEmpleado(){
        return this.claveDeEmpleado;
    }
    public void claveDeEmpleado(int claveEmpleado){
        this.claveDeEmpleado = claveEmpleado;
    }
    
}