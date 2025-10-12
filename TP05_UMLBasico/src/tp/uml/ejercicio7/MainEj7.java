/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio7;

/**
 *
 * @author vallett
 */
public class MainEj7 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 7 — Vehiculo / Motor / Conductor ===");

        Conductor c = new Conductor("Lucía Ramos", "B1-AR-2028");
        Vehiculo v = new Vehiculo("Toyota", "Corolla", "Nafta", 140, c);

        System.out.println(v);
        System.out.println("Desde conductor veo su vehículo: " + c.getVehiculo());
    }

}
