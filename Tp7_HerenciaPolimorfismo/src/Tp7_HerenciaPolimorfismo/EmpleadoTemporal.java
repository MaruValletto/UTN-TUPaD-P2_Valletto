/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public class EmpleadoTemporal extends Empleado {

    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado Temporal: " + nombre +
                " | Valor hora: $" + valorHora +
                " | Horas trabajadas: " + horasTrabajadas +
                " | Sueldo total: $" + calcularSueldo());
    }
}