/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author vallett
 */
public class Ej4EdadInvalida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EJERCICIO 4 - Excepción personalizada EdadInvalidaException =====");

        try {
            System.out.print("Ingresá tu edad: ");
            int edad = scanner.nextInt();

            validarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (InputMismatchException e) {
            System.out.println("Error: debés ingresar un número entero para la edad.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        } finally {
            System.out.println("Finalizando el ejercicio 4.\n");
            scanner.close();
        }
    }

    // Método que lanza la excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
    }
}