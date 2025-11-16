/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public class EmpleadoPlanta extends Empleado {

    private double salarioBase;
    private double bono;

    public EmpleadoPlanta(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Empleado de Planta: " + nombre +
                " | Salario base: $" + salarioBase +
                " | Bono: $" + bono +
                " | Sueldo total: $" + calcularSueldo());
    }
}