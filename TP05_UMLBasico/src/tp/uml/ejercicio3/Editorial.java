/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio3;

/**
 *
 * @author vallett
 */
// Agregación: puede existir sin el Libro
public class Editorial {
    private String nombre;
    private String cuit;

    public Editorial(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }

}
