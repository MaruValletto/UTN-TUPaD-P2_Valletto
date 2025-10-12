/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio9;

/**
 *
 * @author vallett
 */
public class Paciente {
    private String nombre;
    private String dni;

    public Paciente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', dni='" + dni + "'}";
    }

}
