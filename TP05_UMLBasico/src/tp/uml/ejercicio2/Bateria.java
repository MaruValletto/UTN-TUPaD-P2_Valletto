/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio2;

/**
 *
 * @author vallett
 */
// AGREGACIÓN: Celular "tiene una" Batería (pero pueden vivir separados)
public class Bateria {
    private String modelo;
    private int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + "}";
    }        
}
