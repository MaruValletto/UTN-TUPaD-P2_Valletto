/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: cada tipo de empleado calcula su sueldo de forma distinta
    public abstract double calcularSueldo();

    // Método común para mostrar información básica
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre +
                " | Sueldo: $" + calcularSueldo());
    }
}