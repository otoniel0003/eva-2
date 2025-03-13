/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_herencia3;

/**
 *
 * @author Salid
 */
public class EVA2_HERENCIA3 {

    public static void main(String[] args) {
            Empleado empleado = new Empleado();
        empleado.setNombre("juan");
        System.out.println("Nombre: " + empleado.getNombre());
        empleado.setClaveEmpleado(40433);
        //PROVEEDOR
        System.out.println("----------------------");
        Proveedor prov = new Proveedor();
        prov.setNombre("Pepe");
        prov.setCredito(true);
        System.out.println("Nombre: "+ prov.getNombre());
        System.out.println("Credito: "+ prov.isCredito());
        System.out.println("--------------------");
        Cliente cli = new Cliente();
        cli.setNombre("pedro");
        cli.setRazon("Abarrotes pedro");
        System.out.println("Nombre: "+ cli.getNombre());
        System.out.println("Razon: "+ cli.getRazon());
        
    }
}
