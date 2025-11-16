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
public class Ej1DivisionSegura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EJERCICIO 1 - División segura =====");

        try {
            System.out.print("Ingresá el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingresá el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debés ingresar sólo números enteros.");
        } finally {
            System.out.println("Finalizando el ejercicio 1.\n");
            scanner.close();
        }
    }
}
