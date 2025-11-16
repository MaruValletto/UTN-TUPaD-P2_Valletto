/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;

/**
 *
 * @author vallett
 */
public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("Autor { " +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Nacionalidad='" + nacionalidad + '\'' +
                " }");
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }

    // Para poder usar Set<Autor> sin duplicados basados en id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;
        Autor autor = (Autor) o;
        return id != null && id.equals(autor.id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}