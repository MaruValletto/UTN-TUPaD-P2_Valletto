/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tu.paquete;

/**
 *
 * @author vallett
 */
// Clase de prueba: contiene el método main() y ejecuta las acciones sobre los objetos Empleado.
public class Main {
    public static void main(String[] args) {

        // Instancias con constructor reducido (id auto + salario por defecto)
        Empleado e1 = new Empleado("Ana Pérez", "Analista");
        Empleado e2 = new Empleado("Luis Gómez", "Desarrollador");

        // Instancia con constructor completo
        Empleado e3 = new Empleado(100, "Carla Ruiz", "Líder Técnico", 550000.0);
        
        //Imprimir el estado inicial de cada empleado
        System.out.println("=== Estado inicial ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


        // Aplicar actualizaciones de salario con las dos versiones del método sobrecargado
        e1.actualizarSalario(10.0);    // +10%
        e2.actualizarSalario(50000);   // +$50.000
        e3.actualizarSalario(7.5);     // +7.5%

         // Imprimir el estado luego de actualizar los salarios
        System.out.println("\n=== Después de actualizar ===");
        System.out.println("Aplicado a e1: +10%");
        System.out.println(e1);
        System.out.println("Aplicado a e2: +$50.000");
        System.out.println(e2);
        System.out.println("Aplicado a e3: +7,5%");
        System.out.println(e3);
        
        // Total de empleados (método estático)
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());   
    }
}

