/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author vallett
 */

// COMPOSICIÓN 1:1 con Foto + ASOCIACIÓN bidireccional con Titular
public class Pasaporte {
private final String numero;
    private final LocalDate fechaEmision;
    private final Titular titular;  // asociación
    private final Foto foto;        // composición (parte)

    public Pasaporte(String numero, LocalDate fechaEmision,
                     Titular titular, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = new Foto(imagenFoto, formatoFoto); // composición: se crea aquí
        if (titular != null) titular.setPasaporte(this); // bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision +
               ", titular=" + titular + ", foto=" + foto + "}";
    }
}
