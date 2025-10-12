/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio8;

/**
 *
 * @author vallett
 */
// COMPOSICIÓN con Firma + ASOCIACIÓN con Usuario
public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma;     // composición: se crea aquí
    private final Usuario autor;   // asociación unidireccional

    public Documento(String titulo, String contenido,
                     String hashFirmaDigital, String algoritmoFirmaDigital,
                     Usuario autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(hashFirmaDigital, algoritmoFirmaDigital);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido +
               "', firma=" + firma + ", autor=" + autor + "}";
    }

}
