/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio12;

/**
 *
 * @author vallett
 */
public class MainEj12 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 12 — Impuesto / Contribuyente / Calculadora ===");

        Contribuyente cont = new Contribuyente("Laura Pérez", "27-40123456-9");
        Impuesto imp = new Impuesto(100000.0, cont);

        Calculadora calc = new Calculadora();
        calc.calcular(imp); // dependencia de uso
    }

}
