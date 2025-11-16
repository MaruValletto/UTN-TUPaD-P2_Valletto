/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vallett
 */
public class Ej5TryWithResources {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EJERCICIO 5 - Try-with-resources =====");
        System.out.print("Ingresá el nombre del archivo (con extensión): ");
        String nombreArchivo = scanner.nextLine();

        // try-with-resources: el BufferedReader se cierra solo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("\nFinalizando el ejercicio 5.");
            scanner.close();
        }
    }
}
