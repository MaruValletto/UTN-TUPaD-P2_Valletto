/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio12;

/**
 *
 * @author vallett
 */
// Asociación: el Impuesto conoce a su Contribuyente
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    @Override
    public String toString() {
        return "Impuesto{monto=" + monto + ", contribuyente=" + contribuyente + "}";
    }

}
