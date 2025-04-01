/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_composicion_16;

/**
 *
 * @author Salid
 */
public class EVA2_COMPOSICION_16 {

    public static void main(String[] args) {
      Cliente cliente = new Cliente("otoniel", "salido", 18, "monarcas", "villas del rey 31180", "Chihuahua", "Chihuhua");
        System.out.println(cliente);
        Direccion direccion = new Direccion("niños heroes", "villa juarez", "31064", "chihuahua", "Chihuahua");
        cliente.setDireccion(direccion);
        cliente.setDireccion(direccion);
        System.out.println(cliente);
    }
    
}