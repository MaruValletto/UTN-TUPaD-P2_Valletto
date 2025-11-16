/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

/**
 *
 * @author vallett
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con Tarjeta de Crédito por $" + monto);
    }
}
