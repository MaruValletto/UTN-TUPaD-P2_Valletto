/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

/**
 *
 * @author vallett
 */
public class KataInterfacesMain {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marianela", "maru@example.com");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Notebook", 500000));
        pedido.agregarProducto(new Producto("Mouse", 15000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado(EstadoPedido.PROCESANDO);
        pedido.cambiarEstado(EstadoPedido.ENVIADO);

        // Pago con tarjeta
        Pago tarjeta = new TarjetaCredito();
        double montoConDescuento = ((TarjetaCredito) tarjeta).aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(montoConDescuento);

        // Pago con PayPal
        Pago paypal = new PayPal();
        paypal.procesarPago(pedido.calcularTotal());
    }
}