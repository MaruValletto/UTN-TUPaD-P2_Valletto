/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp3;

import java.time.Year;



/**
 *
 * @author vallett
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // validación
    }

    public void setAnioPublicacion(int anio) {
        int actual = Year.now().getValue();
        if (anio >= 1450 && anio <= actual) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido: " + anio + " (se mantiene " + this.anioPublicacion + ")");
        }
    }

    public void mostrarInfo() {
        System.out.printf("Libro: \"%s\" de %s (%d)%n", titulo, autor, anioPublicacion);
    }
}