/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_figuras_interface_14;

/**
 *
 * @author Salid
 */
public class EVA2_FIGURAS_INTERFACE_14 {

    public static void main(String[] args) {
           System.out.println("---Circulo---");
        Circulo circulo = new Circulo(4);
        circulo.mostrarDatos();
        System.out.println("---Rectangulo---");
        Rectangulo rectangulo = new Rectangulo(4, 5);
        rectangulo.mostrarDatos();
    }
    
}