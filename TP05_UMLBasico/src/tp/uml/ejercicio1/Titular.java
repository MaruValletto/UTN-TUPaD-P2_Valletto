/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio1;

/**
 *
 * @author vallett
 */
// Asociación bidireccional con Pasaporte
public class Titular {
private String nombre;
    private String dni;
    private Pasaporte pasaporte; // referencia de vuelta

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
    public Pasaporte getPasaporte() { return pasaporte; }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
