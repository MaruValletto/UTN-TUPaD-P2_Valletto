/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp3;

/**
 *
 * @author vallett
 */
public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.printf("Estudiante: %s %s | Curso: %s | Calificación: %.2f%n",
                nombre, apellido, curso, calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}