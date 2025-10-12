/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio4;

/**
 *
 * @author vallett
 */
public class MainEj4 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4 — Tarjeta, Cliente y Banco ===");

        // Creamos el banco
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");

        // Creamos el cliente
        Cliente cliente1 = new Cliente("María López", "40123456");

        // Creamos la tarjeta asociando cliente y banco
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(
                "1234-5678-9012-3456",
                "12/28",
                cliente1,
                banco1
        );

        // Mostramos resultados
        System.out.println(tarjeta1);
        System.out.println("Cliente accede a su tarjeta: " + cliente1.getTarjeta());
    }

}
