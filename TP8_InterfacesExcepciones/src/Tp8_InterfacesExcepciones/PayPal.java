/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

/**
 *
 * @author vallett
 */
public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado vía PayPal por $" + monto);
    }
}