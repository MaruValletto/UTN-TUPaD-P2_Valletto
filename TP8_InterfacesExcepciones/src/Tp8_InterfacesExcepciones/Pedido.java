/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp8_InterfacesExcepciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vallett
 */
public class Pedido implements Pagable {

    private List<Producto> productos;
    private EstadoPedido estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.CREADO;
        this.cliente = cliente;
        notificarEstado();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        cliente.notificar("Se agregó el producto: " + p);
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        notificarEstado();
    }

    private void notificarEstado() {
        cliente.notificar("El pedido cambió al estado: " + estado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}