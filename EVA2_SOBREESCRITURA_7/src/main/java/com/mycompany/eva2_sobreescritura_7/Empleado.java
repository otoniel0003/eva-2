/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_sobreescritura_7;

/**
 *
 * @author Salid
 */
public class Empleado {
  private String nombre;
    private String apellidos;
    protected double salario;
    
    public Empleado(){
        this.nombre = "-Sin nombre-";
        this.apellidos = "-Sin apellidos-";
        this.salario = 0.0;
    }
    public Empleado(String nombre, String apellidos, double salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    protected double calcularSalario(){
        return salario;
    }
    
    @Override
    public String toString(){
        String cade = "Nombre: " + nombre + "\n" + 
                "Apellidos: " + apellidos + "\n" + 
                "Salario (sin calculo): " + salario;
        return cade;
    }
    
}