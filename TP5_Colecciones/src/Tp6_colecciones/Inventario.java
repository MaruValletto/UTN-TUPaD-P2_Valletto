/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vallett
 */
public class Inventario {
private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // agregarProducto(Producto p)
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // listarProductos()
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Listado de productos en inventario:");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }

    // buscarProductoPorId(String id)
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // eliminarProducto(String id)
    public boolean eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            return true;
        }
        return false;
    }

    // actualizarStock(String id, int nuevaCantidad)
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // filtrarPorCategoria(CategoriaProducto categoria)
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // obtenerTotalStock()
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // obtenerProductoConMayorStock()
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    // filtrarProductosPorPrecio(double min, double max)
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // mostrarCategoriasDisponibles()
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}
