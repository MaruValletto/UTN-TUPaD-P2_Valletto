/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio2;

/**
 *
 * @author vallett
 */

// Clase de prueba del Ejercicio 2
public class MainEj2 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Luis Gómez", "39.777.888");
        Bateria b = new Bateria("Li-Ion XZ-40", 5000);
        Celular c = new Celular("356789012345678", "Samsung", "A54", b, u);

        System.out.println("=== Ejercicio 2 ===");
        System.out.println(c);
    }
}
