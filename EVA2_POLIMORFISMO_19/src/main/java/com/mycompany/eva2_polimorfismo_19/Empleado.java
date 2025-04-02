/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_polimorfismo_19;

/**
 *
 * @author Salid
 */
public class Empleado extends Persona{
    private int claveEmpleado;

    public Empleado() {
        super();
        this.claveEmpleado = 0;
    }

    public Empleado(String nombre, String apellidos, int edad,int claveEmpleado) {
        super(nombre, apellidos, edad);
        this.claveEmpleado = claveEmpleado;
    }
    
    

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Clave: " + claveEmpleado);
    }
    
    
}