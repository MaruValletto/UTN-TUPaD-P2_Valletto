/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vallett
 */
public class SistemaBiblioteca {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 1) Creamos una biblioteca.
        System.out.println("\n===== 1) Creación de la biblioteca =====");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());

        // 2) Crear al menos tres autores.
        System.out.println("\n===== 2) Creación de autores =====");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("A002", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A003", "Jane Austen", "Reino Unido");

        System.out.println("Autores creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

        // 3) Agregar 5 libros asociados a alguno de los autores a la biblioteca.
        System.out.println("\n===== 3) Agregar libros a la biblioteca =====");
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "Orgullo y prejuicio", 1813, autor3);
        biblioteca.agregarLibro("ISBN005", "Emma", 1815, autor3);

        System.out.println("Libros iniciales cargados correctamente.\n");

        // Menú para el resto de las tareas (4 a 9)
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elegí una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Ingresá un número.");
                scanner.next();
                System.out.print("Elegí una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // 4) Listar todos los libros con su información y la del autor.
                    System.out.println("\n===== 4) Listar todos los libros con su información y la del autor =====");
                    biblioteca.listarLibros();
                    break;

                case 2:
                    // 5) Buscar un libro por su ISBN y mostrar su información.
                    System.out.println("\n===== 5) Buscar libro por ISBN =====");
                    System.out.print("Ingresá el ISBN del libro: ");
                    String isbnBuscado = scanner.nextLine();
                    Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
                    if (encontrado != null) {
                        System.out.println("Libro encontrado:");
                        encontrado.mostrarInfo();
                    } else {
                        System.out.println("No se encontró un libro con ISBN " + isbnBuscado);
                    }
                    break;

                case 3:
                    // 6) Filtrar y mostrar los libros publicados en un año específico.
                    System.out.println("\n===== 6) Filtrar libros por año de publicación =====");
                    System.out.print("Ingresá el año a filtrar: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Valor inválido. Ingresá un año (número entero).");
                        scanner.next();
                        System.out.print("Ingresá el año a filtrar: ");
                    }
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    List<Libro> librosPorAnio = biblioteca.filtrarLibrosPorAnio(anio);
                    if (librosPorAnio.isEmpty()) {
                        System.out.println("No hay libros publicados en el año " + anio);
                    } else {
                        System.out.println("Libros publicados en el año " + anio + ":");
                        for (Libro libro : librosPorAnio) {
                            libro.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    // 7) Eliminar un libro por su ISBN y listar los libros restantes.
                    System.out.println("\n===== 7) Eliminar libro por ISBN y listar los restantes =====");
                    System.out.print("Ingresá el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    boolean eliminado = biblioteca.eliminarLibro(isbnEliminar);
                    if (eliminado) {
                        System.out.println("Libro con ISBN " + isbnEliminar + " eliminado correctamente.");
                        System.out.println("Libros restantes en la biblioteca:");
                        biblioteca.listarLibros();
                    } else {
                        System.out.println("No se encontró un libro con ISBN " + isbnEliminar);
                    }
                    break;

                case 5:
                    // 8) Mostrar la cantidad total de libros en la biblioteca.
                    System.out.println("\n===== 8) Cantidad total de libros en la biblioteca =====");
                    int cantidadLibros = biblioteca.obtenerCantidadLibros();
                    System.out.println("Cantidad total de libros: " + cantidadLibros);
                    break;

                case 6:
                    // 9) Listar todos los autores de los libros disponibles en la biblioteca.
                    System.out.println("\n===== 9) Listar todos los autores de los libros disponibles =====");
                    biblioteca.mostrarAutoresDisponibles();
                    break;

                case 7:
                    // Extra: Agregar un nuevo libro desde consola
                    System.out.println("\n===== Extra) Agregar un nuevo libro a la biblioteca =====");
                    agregarLibroDesdeConsola(biblioteca, autor1, autor2, autor3);
                    break;

                case 0:
                    System.out.println("\nSaliendo del sistema de biblioteca. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intentá nuevamente.");
            }

        } while (opcion != 0);
    }

    // ---------------- MÉTODOS AUXILIARES ----------------

    private static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("        SISTEMA DE BIBLIOTECA - MENÚ    ");
        System.out.println("========================================");
        System.out.println("1. Listar todos los libros");
        System.out.println("2. Buscar libro por ISBN");
        System.out.println("3. Filtrar libros por año de publicación");
        System.out.println("4. Eliminar libro por ISBN y listar restantes");
        System.out.println("5. Mostrar cantidad total de libros");
        System.out.println("6. Listar autores de los libros disponibles");
        System.out.println("7. Agregar nuevo libro");
        System.out.println("0. Salir");
        System.out.println("========================================");
    }

    // Para el extra: permitir agregar un libro nuevo eligiendo autor
    private static void agregarLibroDesdeConsola(Biblioteca biblioteca, Autor a1, Autor a2, Autor a3) {
        System.out.print("Ingresá el ISBN del libro: ");
        String isbn = scanner.nextLine();

        System.out.print("Ingresá el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingresá el año de publicación: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido. Ingresá un año (número entero).");
            scanner.next();
            System.out.print("Ingresá el año de publicación: ");
        }
        int anio = scanner.nextInt();
        scanner.nextLine();

        // Elegir uno de los autores ya creados (para no complicar la consigna)
        System.out.println("Elegí un autor para el libro:");
        System.out.println("1. " + a1);
        System.out.println("2. " + a2);
        System.out.println("3. " + a3);
        System.out.print("Opción: ");

        Autor autorSeleccionado = null;
        while (autorSeleccionado == null) {
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Ingresá 1, 2 o 3.");
                scanner.next();
                System.out.print("Opción: ");
            }
            int opAutor = scanner.nextInt();
            scanner.nextLine();

            switch (opAutor) {
                case 1:
                    autorSeleccionado = a1;
                    break;
                case 2:
                    autorSeleccionado = a2;
                    break;
                case 3:
                    autorSeleccionado = a3;
                    break;
                default:
                    System.out.println("Opción inválida. Ingresá 1, 2 o 3.");
                    autorSeleccionado = null;
            }
        }

        biblioteca.agregarLibro(isbn, titulo, anio, autorSeleccionado);
        System.out.println("Libro agregado correctamente.");
    }
}