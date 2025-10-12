/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio12;

/**
 *
 * @author vallett
 */
/**
 * Dependencia de uso:
 * Calculadora NO almacena un Impuesto, lo recibe en el método calcular(...).
 * Aquí simulamos una regla simple: 21% de IVA sobre el monto del Impuesto.
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        double base = impuesto.getMonto();
        double iva = base * 0.21;
        double total = base + iva;

        System.out.println("Calculando para " + impuesto.getContribuyente());
        System.out.printf("Base: %.2f  IVA(21%%): %.2f  Total: %.2f%n", base, iva, total);
    }

}
