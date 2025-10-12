/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio9;

/**
 *
 * @author vallett
 */
public class Profesional {
    private String nombre;
    private String matricula;

    public Profesional(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Profesional{nombre='" + nombre + "', matricula='" + matricula + "'}";
    }

}
