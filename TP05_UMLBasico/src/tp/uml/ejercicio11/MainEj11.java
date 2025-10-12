/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio11;

/**
 *
 * @author vallett
 */
public class MainEj11 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 11 — Reproductor / Cancion / Artista ===");

        Artista a = new Artista("Gustavo Cerati", "Rock");
        Cancion c = new Cancion("Crimen", a);

        Reproductor r = new Reproductor();
        r.reproducir(c); // dependencia de uso: parámetro del método
    }

}
