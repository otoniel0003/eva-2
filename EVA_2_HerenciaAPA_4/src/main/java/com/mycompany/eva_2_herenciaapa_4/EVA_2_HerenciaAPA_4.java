/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_herenciaapa_4;

/**
 *
 * @author Salid
 */
public class EVA_2_HerenciaAPA_4 {

    public static void main(String[] args) {
        System.out.println("----------------------");
        FichaApa prov = new FichaApa();
        Libro lib = new Libro();
        System.out.println("----/Libro/-------");
        prov.setAutor("Antoine de Saint-Exupéry");
        prov.setTitulo("el principito");
        prov.setYear(1943);
        lib.setEditorial("Reynal & Hitchcock");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Editorial: "+ lib.getEditorial());
        
        Grabacion grabe = new Grabacion();
        System.out.println("------/Grabacion/---------");
        prov.setTitulo("Noche de verano");
        prov.setYear(2020);
        grabe.setInterprete("Stromae");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Interprete  : "+ grabe.getInterprete());
        
        System.out.println("--------/Enciclopedia/----------");
        Enciclopedia enci = new Enciclopedia();
        enci.setAutor("Guadalupo");
        System.out.println("Autor: "+enci.getAutor());
        System.out.println("Titulo: "+enci.getTitulo());
        System.out.println("Lanzamiento: "+enci.getYear());
        System.out.println("Editorial: "+enci.getEditorial());
    }
    
}
