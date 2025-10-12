/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio7;

/**
 *
 * @author vallett
 */
// Asociación bidireccional con Vehiculo
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // referencia inversa (puede ser null)

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public Vehiculo getVehiculo() { return vehiculo; }

    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}";
    }

}
