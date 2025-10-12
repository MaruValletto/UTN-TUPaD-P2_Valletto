/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tu.paquete;

/**
 *
 * @author vallett
 */
public class Main {
    public static void main(String[] args) {

        // Instancias con constructor reducido (id auto + salario por defecto)
        Empleado e1 = new Empleado("Ana Pérez", "Analista");
        Empleado e2 = new Empleado("Luis Gómez", "Desarrollador");

        // Instancia con constructor completo
        Empleado e3 = new Empleado(100, "Carla Ruiz", "Líder Técnico", 550000.0);

        // Aumentos: porcentaje y monto fijo
        e1.actualizarSalario(10.0);    // +10%
        e2.actualizarSalario(50000);   // +$50.000
        e3.actualizarSalario(7.5);     // +7.5%

        // Impresión legible
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Total de empleados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

