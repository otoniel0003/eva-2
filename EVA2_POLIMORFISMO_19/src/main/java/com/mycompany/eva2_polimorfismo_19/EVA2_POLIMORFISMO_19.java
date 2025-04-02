/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_polimorfismo_19;

/**
 *
 * @author Salid
 */
public class EVA2_POLIMORFISMO_19 {

    public static void main(String[] args) {
        Empleado[] empleado = new Empleado[5];
        empleado[0] = new Empleado("otoniel", "salido", 18, 40433134);
        empleado[1] = new Empleado("rafael", "martinez", 29, 4);
        empleado[2] = new Empleado("pedro", "zapata", 39, 3);
        empleado[3] = new Empleado("Emiliano", "rascon", 25, 2);
        empleado[4] = new Empleado("arthur", "mejia", 69, 0);
        
        Cliente[] cliente = new Cliente[5];
        cliente[0] = new Cliente("otoniel", "XXXX", 18, "15648");
        cliente[1] = new Cliente("Emilio", "XXXX", 35, "1544154");
        cliente[2] = new Cliente("Sarahi", "XXXX", 30, "df5158548dfss");
        cliente[3] = new Cliente("ramon", "XXXX", 40, "48445498");
        cliente[4] = new Cliente("luna", "XXXX", 24, "121648");
        
        System.out.println("REPORTE DE EMPLEADOS-------------------");
        reportesDeEmpleado(empleado);
        
        System.out.println("REPORTE DE CLIENTES-------------------");
        reportesDeEmpleado(cliente);
        
    }
    
    public static void reportesDeEmpleado(Persona[] personas){
        for (int i = 0; i<5; i++){
            personas[i].imprimirDatos();
        }
    }
    
}