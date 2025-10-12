/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio6;
import java.time.LocalDateTime;


/**
 *
 * @author vallett
 */
public class MainEj6 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 6 — Reserva / Cliente / Mesa ===");

        Mesa m = new Mesa(12, 4);
        Cliente c = new Cliente("Martín López", "+54 9 11 5555-5555");
        Reserva r = new Reserva(LocalDateTime.of(2025, 10, 20, 20, 30),
                                4, m, c);

        System.out.println(r);
    }

}
