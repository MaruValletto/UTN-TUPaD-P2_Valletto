/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio11;

/* @author vallett */

/**
 * Dependencia de uso:
 * Reproductor NO almacena una Cancion como atributo.
 * Solo la USA como parámetro del método reproducir(...).
 */
public class Reproductor {
     public void reproducir(Cancion cancion) {
        System.out.println("▶ Reproduciendo: " + cancion.getTitulo());
        System.out.println("   Artista: " + cancion.getArtista());
    }

}
