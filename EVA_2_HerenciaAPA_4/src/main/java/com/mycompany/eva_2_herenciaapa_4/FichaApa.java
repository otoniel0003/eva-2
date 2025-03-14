/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_herenciaapa_4;

/**
 *
 * @author Salid
 */
public class FichaApa {
    private String autor;
    private String Titulo;
    private int year;

public FichaApa(){
    this.autor = "Sin autor";
    this.Titulo = "sin titulo";
    this.year = 0;
}
public FichaApa(String autor, String titulo, int year){
    this.autor =  autor;
    this.Titulo = titulo;
    this.year = year;
}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    

}
