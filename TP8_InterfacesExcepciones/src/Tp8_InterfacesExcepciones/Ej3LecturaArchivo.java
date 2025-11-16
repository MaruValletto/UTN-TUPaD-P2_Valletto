/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vallett
 */
public class Ej3LecturaArchivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EJERCICIO 3 - Lectura de archivo =====");
        System.out.print("Ingresá el nombre del archivo (con extensión): ");
        String nombreArchivo = scanner.nextLine();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo: " + e.getMessage());
        } finally {
            System.out.println("\nFinalizando el ejercicio 3.");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
            scanner.close();
        }
    }
}