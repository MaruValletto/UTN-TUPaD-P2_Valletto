/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio11;

/**
 *
 * @author vallett
 */
// Asociación unidireccional: la Cancion conoce a su Artista
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }

    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', artista=" + artista + "}";
    }

}
