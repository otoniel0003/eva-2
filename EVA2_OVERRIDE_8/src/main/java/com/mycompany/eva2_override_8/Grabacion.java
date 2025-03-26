/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_override_8;

/**
 *
 * @author Salid
 */
public class Grabacion {
        super();
        this.interprete = "Sin interprete";
    }
    public Grabacion(String autor, String titulo, int year, String interprete){
        super(autor, titulo, year);
        this.interprete = interprete;
    }
    
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "\nInterprete: " + interprete;
        return cade; 
    }
    
}