/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio13;

/**
 *
 * @author vallett
 */
public class MainEj13 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 13 — GeneradorQR / Usuario / CodigoQR ===");

        Usuario u = new Usuario("Camila Torres", "camila@mail.com");
        GeneradorQR gen = new GeneradorQR();

        // Dependencia de creación
        gen.generar("QR-001-A1B2C3", u);
    }

}
