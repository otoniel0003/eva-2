/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen_practico;

/**
 *
 * @author Salid
 */
public class TestCovid {
    private boolean enfermedadCronica;
    private int edad;
    private double peso;
    private double altura;
    private double mts;
    
    public TestCovid(){
        enfermedadCronica = false;
        edad = 0;
        peso = 0.0;
        altura = 0.0;
    }
    
    public TestCovid(boolean enfermedadCronica, int edad, double peso, double altura){
        this.enfermedadCronica = enfermedadCronica;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    public boolean getEnfermedadCronica(){
        return this.enfermedadCronica;
    }
    public void setE_Cronica(boolean enfermedadCronica){
        this.enfermedadCronica = enfermedadCronica;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    private double calcularIMC(){
        double mts = altura / 100.0;
        return (peso/(mts*mts));
    }
    public String calcularPersonaRiesgo(){
        if (edad >= 65){
            System.out.println("PERSONA DE RIESGO");
        }else if(enfermedadCronica == true){
            System.out.println("PERSONA DE RIESGO");
        }else if(calcularIMC() >= 30){
            System.out.println("PERSONA DE RIESGO");
        }else {
            System.out.println("PERSONA SIN RIESGO");
        }
        return null;
    }
}