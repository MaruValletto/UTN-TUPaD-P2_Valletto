/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio10;

/**
 *
 * @author vallett
 */
public class Titular {
    private String nombre;
    private String dni;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }

}
