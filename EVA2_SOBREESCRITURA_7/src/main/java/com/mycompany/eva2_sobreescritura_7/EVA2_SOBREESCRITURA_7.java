/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_sobreescritura_7;

/**
 *
 * @author Salid
 */
public class EVA2_SOBREESCRITURA_7 {

    public static void main(String[] args) {
  System.out.println("---------Empleado Base------------");
        EmpleadoBase empleadoBase = new EmpleadoBase("otoniel", "salido", 2000, 2, 0.1);
        System.out.println( empleadoBase);
        System.out.println("----------Empleado Tmporal----------");
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("arthuro", "reyes", 500, "arrs556622", 8.5);
        System.out.println(empleadoTemporal);
    }
    
}