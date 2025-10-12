/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio10;

/**
 *
 * @author vallett
 */
public class MainEj10 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 10 — Cuenta / Clave / Titular ===");

        Titular t = new Titular("Nicolás Vera", "39.111.222");
        Cuenta c = new Cuenta("2850590940090418135201", t,
                              "e3b0c44298fc1c149afbf4c8996fb924", "SHA-256");

        System.out.println(c);
    }

}
