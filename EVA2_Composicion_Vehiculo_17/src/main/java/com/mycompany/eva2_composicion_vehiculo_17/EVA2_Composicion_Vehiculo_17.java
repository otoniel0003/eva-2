/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_composicion_vehiculo_17;

/**
 *
 * @author Salid
 */
public class EVA2_Composicion_Vehiculo_17 {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        System.out.println(vehiculo);
        vehiculo.setMarca("Chevrolet");
       vehiculo.setModelo("camaro");
        vehiculo.setYear(2012);
        Motor motor = new Motor(0, 500);
        vehiculo.setMotor(motor);
        System.out.println(vehiculo);
    }
    
}