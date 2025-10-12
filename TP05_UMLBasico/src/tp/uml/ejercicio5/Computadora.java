/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio5;

/**
 *
 * @author vallett
 */
// COMPOSICIÓN con PlacaMadre + ASOCIACIÓN con Propietario
public class Computadora {
    private final String marca;
    private final String modelo;
    private final PlacaMadre placa; // composición (la Computadora la crea)
    private final Propietario propietario; // asociación

    public Computadora(String marca, String modelo,
              String chipsetPlaca, String socketPlaca,
              Propietario propietario) {

        this.marca = marca;
        this.modelo = modelo;
        this.placa = new PlacaMadre(chipsetPlaca, socketPlaca); // composición: se crea aquí
        this.propietario = propietario;

        if (propietario != null) propietario.setPc(this); // cerramos lazo bidireccional
    }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', modelo='" + modelo +
               "', placa=" + placa + ", propietario=" + propietario + "}";
    }

}
