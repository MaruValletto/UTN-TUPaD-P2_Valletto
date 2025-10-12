/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio3;

/**
 *
 * @author vallett
 */
public class MainEj3 {
       public static void main(String[] args) {
        Autor autor = new Autor("Julio Cortázar", "Argentina");
        Editorial ed = new Editorial("Alfaguara", "30-12345678-9");
        Libro libro = new Libro("Rayuela", 1963, autor, ed);

        System.out.println("=== Ejercicio 3 ===");
        System.out.println(libro);
    }
}
