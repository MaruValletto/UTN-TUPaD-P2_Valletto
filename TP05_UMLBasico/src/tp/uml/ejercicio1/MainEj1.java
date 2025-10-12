/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author vallett
 */
// Clase de prueba del Ejercicio 1
public class MainEj1 {
public static void main(String[] args) {
        Titular t = new Titular("Ana Pérez", "40.123.456");
        Pasaporte p = new Pasaporte(
                "AR-2025-0001",
                LocalDate.of(2025, 3, 1),
                t,
                "/fotos/pasaporte-ana.jpg",
                "JPG"
        );

        System.out.println("=== Ejercicio 1 ===");
        System.out.println(p);
        System.out.println("Desde titular: " + t.getPasaporte());
    }
}
