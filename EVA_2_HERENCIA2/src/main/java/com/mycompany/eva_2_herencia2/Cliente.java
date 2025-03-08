/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_herencia2;

/**
 *
 * @author Salid
 */
public class Cliente {
   private String nombre;
   private String ApellidoPaterno;
   private String ApellidoMaterno;
   private int edad;
   private String rfc;
  
  
  public Cliente(){
      nombre= "vacio";
      ApellidoPaterno="vacio";
      ApellidoMaterno="vacio";
      edad=0;
      rfc="vacio";
  }
public Cliente(String nombre, String ApellidoPaterno, String ApellidoMaterno, int edad, String rfc){
    this.nombre = nombre;
    this.ApellidoPaterno = ApellidoPaterno;
    this.ApellidoMaterno = ApellidoMaterno;
    this.edad = edad;
    this.rfc = rfc;
}         

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
