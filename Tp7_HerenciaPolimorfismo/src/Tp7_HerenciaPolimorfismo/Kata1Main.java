/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public class Kata1Main {

    public static void main(String[] args) {

        System.out.println("===== KATA 1 - Herencia básica de Vehículo y Auto =====");

        // Creamos un vehículo genérico
        Vehiculo vehiculo = new Vehiculo("Ford", "Transit", 2015);
        vehiculo.mostrarInfo(); // llamada al método de Vehiculo

        System.out.println("-------------------------------------------");

        // Creamos un auto específico (subclase)
        Auto auto = new Auto("Toyota", "Corolla", 2022, 4);
        auto.mostrarInfo(); // llamada al método sobrescrito en Auto

        System.out.println("-------------------------------------------");

        // Demostración de polimorfismo: referencia de tipo Vehiculo, objeto Auto
        Vehiculo vehiculoPolimorfico = new Auto("Renault", "Sandero", 2020, 5);
        vehiculoPolimorfico.mostrarInfo(); 
        // Aunque la referencia es Vehiculo, se ejecuta el mostrarInfo() de Auto (polimorfismo)

        System.out.println("===== Fin KATA 1 =====");
    }
}
