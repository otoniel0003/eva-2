/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_vehiculo_20;

/**
 *
 * @author Salid
 */
public class EVA2_VEHICULO_20 {

    public static void main(String[] args) {
         Vehiculo veh = new Vehiculo();
        veh.setMarca("chevrolete");
        veh.setModelo("camaro");
        veh.setYear("2024");
        //tipo de motor 
        MotorElectrico miMotor = new MotorElectrico();
        MotorDisel Disel = new MotorDisel();
        MotorGasolina Gas = new MotorGasolina();
        veh.setMotor(Gas);
        System.out.println(veh);
    }
    
}