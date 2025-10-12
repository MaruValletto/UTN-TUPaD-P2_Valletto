/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio5;

/**
 *
 * @author vallett
 */
public class MainEj5 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5 — Computadora / PlacaMadre / Propietario ===");

        Propietario p = new Propietario("Sofía Díaz", "40.888.999");
        Computadora Computadora = new Computadora("Lenovo", "ThinkStation",
                "Z790", "LGA1700", p);

        System.out.println(Computadora);
        System.out.println("Desde propietario veo su Computadora: " + p.getPc());
    }

}
