/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author Salid
 */
public class EVA2_EXAMEN_PRACTICO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("¿Tiene enfermedad crónica? (true/false): ");
        boolean enfermedadCronica = scanner.nextBoolean();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura (cm): ");
        double altura = scanner.nextDouble();

        // Crear objeto TestCovid con los datos ingresados
        TestCovid persona = new TestCovid(enfermedadCronica, edad, peso, altura);
        
        // Determinar si la persona está en riesgo
        persona.calcularPersonaRiesgo();
        
        scanner.close();
    }
}