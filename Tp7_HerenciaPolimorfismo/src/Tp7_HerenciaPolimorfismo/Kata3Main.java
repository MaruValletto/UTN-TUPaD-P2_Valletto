/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vallett
 */
public class Kata3Main {

    public static void main(String[] args) {

        System.out.println("===== KATA 3 - Empleados y Polimorfismo =====");

        // Upcasting: referencias de tipo Empleado a objetos concretos
        Empleado e1 = new EmpleadoPlanta("Ana López", 300000, 50000);
        Empleado e2 = new EmpleadoTemporal("Carlos Pérez", 2500, 80);
        Empleado e3 = new EmpleadoPlanta("María Gómez", 280000, 30000);
        Empleado e4 = new EmpleadoTemporal("Juan Díaz", 2000, 60);

        // Lista polimórfica de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);

        System.out.println("Listado de empleados y sueldos (polimorfismo):\n");

        int contadorPlanta = 0;
        int contadorTemporales = 0;

        for (Empleado emp : empleados) {
            emp.mostrarInfo(); // llamada polimórfica

            // Clasificación usando instanceof
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("→ Tipo: Empleado de Planta");
                contadorPlanta++;
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("→ Tipo: Empleado Temporal");
                contadorTemporales++;
            }

            System.out.println("-------------------------------------------");
        }

        System.out.println("Resumen:");
        System.out.println("Cantidad de empleados de planta: " + contadorPlanta);
        System.out.println("Cantidad de empleados temporales: " + contadorTemporales);

        System.out.println("===== Fin KATA 3 =====");
    }
}