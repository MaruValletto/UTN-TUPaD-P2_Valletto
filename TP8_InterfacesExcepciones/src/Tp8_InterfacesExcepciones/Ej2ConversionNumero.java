/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

import java.util.Scanner;

/**
 *
 * @author vallett
 */
public class Ej2ConversionNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EJERCICIO 2 - Conversión de cadena a número =====");

        System.out.print("Ingresá un número (como texto): ");
        String numeroTexto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(numeroTexto);
            System.out.println("Conversión exitosa. El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        } finally {
            System.out.println("Finalizando el ejercicio 2.\n");
            scanner.close();
        }
    }
}
