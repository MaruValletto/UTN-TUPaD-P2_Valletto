/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vallett
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    // listarLibros()
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros cargados en la biblioteca.");
        } else {
            System.out.println("Listado de libros de la biblioteca \"" + nombre + "\":");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    // buscarLibroPorIsbn(String isbn)
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // eliminarLibro(String isbn)
    public boolean eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            return true;
        }
        return false;
    }

    // obtenerCantidadLibros()
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // filtrarLibrosPorAnio(int anio)
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }

    // mostrarAutoresDisponibles()
    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca, por lo tanto no hay autores para mostrar.");
            return;
        }

        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }

        if (autores.isEmpty()) {
            System.out.println("No se encontraron autores asociados a los libros.");
        } else {
            System.out.println("Autores de los libros disponibles en la biblioteca:");
            for (Autor autor : autores) {
                autor.mostrarInfo();
            }
        }
    }
}