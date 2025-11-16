/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;

/**
 *
 * @author vallett
 */
public class Producto {
    private String id;                     // Identificador único
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters y setters (solo los que necesitemos)
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    // Método mostrar informacion
    public void mostrarInfo() {
        System.out.println("ID: " + id
                + " | Nombre: " + nombre
                + " | Precio: $" + precio
                + " | Cantidad: " + cantidad
                + " | Categoría: " + categoria
                + " (" + categoria.getDescripcion() + ")");
    }

    // toString para depuración y listados
    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}
