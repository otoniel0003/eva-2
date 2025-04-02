/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_polimorfismo_19;

/**
 *
 * @author Salid
 */
public class Cliente extends Persona{
    //Razon social
    private String rfc;

    public Cliente(){
        super();
        this.rfc = "vacio";
    }

    public Cliente(String nombre, String apellidos, int edad, String rfc) {
        super(nombre, apellidos, edad);
        this.rfc = rfc;
    }
    
    public String getRFC() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+rfc);
    }
}