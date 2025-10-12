/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio5;

/**
 *
 * @author vallett
 */
// Asociación bidireccional con PC
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora Computadora; // referencia de vuelta (puede ser null)

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setPc(Computadora pc) { this.Computadora = pc; } // paquete-default: solo PC debería llamarlo
    public Computadora getPc() { return Computadora; }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }

}
