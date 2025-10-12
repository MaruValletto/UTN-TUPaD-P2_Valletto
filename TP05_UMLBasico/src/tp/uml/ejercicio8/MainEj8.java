/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio8;

/**
 *
 * @author vallett
 */
public class MainEj8 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 8 — Documento / Firma Digital / Usuario ===");

        Usuario u = new Usuario("Marcos Peña", "marcos@example.com");
        Documento d = new Documento(
                "Contrato de Servicios",
                "Cláusulas y condiciones...",
                "abc123def456", "SHA-256",
                u
        );

        System.out.println(d);
    }

}
