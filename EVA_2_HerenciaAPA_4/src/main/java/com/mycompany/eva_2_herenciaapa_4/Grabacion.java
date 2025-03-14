/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_herenciaapa_4;

/**
 *
 * @author Salid
 */
public class Grabacion extends FichaApa {
    private String interprete;
    
    
    public Grabacion(){
        super();
        this.interprete = "sin interprete";
        
    }
public Grabacion(String autor, String titulo, int year, String interprete){
    super(autor, titulo, year);
    this.interprete = interprete;
    
}            
public String getInterprete(){
    return interprete;
}            
public void setInterprete(String interprete){
    this.interprete = interprete;
}
}
