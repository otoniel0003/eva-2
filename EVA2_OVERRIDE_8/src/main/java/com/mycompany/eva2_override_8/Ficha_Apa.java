/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_override_8;

/**
 *
 * @author Salid
 */
public class Ficha_Apa {
   private String autor;
    private String titulo;
    private int year;
    
    public Ficha_Apa(){
        this.autor = "Sin autor";
        this.titulo = "Sin titulo";
        this.year = 0000;
    }
    public Ficha_Apa(String autor, String titulo, int year){
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString(){
        String cade = "Autor: " + autor + "\n" + 
                "Titulo: " + titulo + "\n" + 
                "Lanzamiento (año de publicacion): " + year;
        return cade;
    }
    
    
}