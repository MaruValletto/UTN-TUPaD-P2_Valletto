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
public class SistemaStock {
   // Scanner único para toda la clase
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // ===== 1) Crear al menos cinco productos con diferentes categorías y agregarlos al inventario =====
        System.out.println("\n===== 1) Creación de productos y agregado al inventario =====");

        Producto p1 = new Producto("P001", "Arroz 1kg", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 350000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 8000.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 15000.0, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletitas", 900.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Productos iniciales cargados correctamente.\n");

        // ===== Menú interactivo para el resto de las tareas =====
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elegí una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Ingresá un número.");
                scanner.next(); // descarta lo que no es número
                System.out.print("Elegí una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpia el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n===== 1) Listar todos los productos del inventario =====");
                    inventario.listarProductos();
                    break;

                case 2:
                    System.out.println("\n===== 2) Búsqueda de producto por ID =====");
                    System.out.print("Ingresá el ID del producto: ");
                    String idBusqueda = scanner.nextLine();
                    Producto buscado = inventario.buscarProductoPorId(idBusqueda);
                    if (buscado != null) {
                        buscado.mostrarInfo();
                    } else {
                        System.out.println("No se encontró un producto con ID " + idBusqueda);
                    }
                    break;

                case 3:
                    System.out.println("\n===== 3) Filtrar productos por categoría =====");
                    CategoriaProducto categoria = leerCategoriaDesdeUsuario();
                    if (categoria != null) {
                        List<Producto> filtrados = inventario.filtrarPorCategoria(categoria);
                        if (filtrados.isEmpty()) {
                            System.out.println("No hay productos en la categoría " + categoria);
                        } else {
                            System.out.println("Productos en la categoría " + categoria + ":");
                            for (Producto p : filtrados) {
                                p.mostrarInfo();
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n===== 4) Eliminación de producto por ID =====");
                    System.out.print("Ingresá el ID del producto a eliminar: ");
                    
                    String idEliminar = scanner.nextLine();
                    boolean eliminado = inventario.eliminarProducto(idEliminar);
                    if (eliminado) {
                        System.out.println("Producto con ID " + idEliminar + " eliminado correctamente.");
                        System.out.println("Listado de productos restantes en el inventario:");
                        inventario.listarProductos();   // 👈 acá mostramos los que quedaron
                    } else {
                        System.out.println("No se encontró un producto con ID " + idEliminar);
                    }
                    break;

                case 5:
                    System.out.println("\n===== 5) Actualización de stock de un producto =====");
                    System.out.print("Ingresá el ID del producto a actualizar: ");
                    String idActualizar = scanner.nextLine();
                    System.out.print("Ingresá la nueva cantidad de stock: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Valor inválido. Ingresá un número entero.");
                        scanner.next();
                        System.out.print("Ingresá la nueva cantidad de stock: ");
                    }
                    int nuevaCantidad = scanner.nextInt();
                    scanner.nextLine();

                    boolean actualizado = inventario.actualizarStock(idActualizar, nuevaCantidad);
                    if (actualizado) {
                        System.out.println("Stock actualizado correctamente.");
                    } else {
                        System.out.println("No se encontró un producto con ID " + idActualizar);
                    }
                    break;

                case 6:
                    System.out.println("\n===== 6) Total de stock disponible en el inventario =====");
                    int totalStock = inventario.obtenerTotalStock();
                    System.out.println("Total de unidades en inventario: " + totalStock);
                    break;

                case 7:
                    System.out.println("\n===== 7) Producto con mayor stock =====");
                    Producto mayorStock = inventario.obtenerProductoConMayorStock();
                    if (mayorStock != null) {
                        System.out.println("Producto con mayor stock:");
                        mayorStock.mostrarInfo();
                    } else {
                        System.out.println("No hay productos en el inventario.");
                    }
                    break;

                case 8:
                    System.out.println("\n===== 8) Filtrar productos por precio (entre un mínimo y un máximo) =====");
                    System.out.print("Ingresá el precio mínimo: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido. Ingresá un número (usar punto como separador decimal).");
                        scanner.next();
                        System.out.print("Ingresá el precio mínimo: ");
                    }
                    double min = scanner.nextDouble();

                    System.out.print("Ingresá el precio máximo: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Valor inválido. Ingresá un número (usar punto como separador decimal).");
                        scanner.next();
                        System.out.print("Ingresá el precio máximo: ");
                    }
                    double max = scanner.nextDouble();
                    scanner.nextLine();

                    List<Producto> rangoPrecio = inventario.filtrarProductosPorPrecio(min, max);
                    if (rangoPrecio.isEmpty()) {
                        System.out.println("No hay productos en el rango de precio especificado.");
                    } else {
                        System.out.println("Productos entre $" + min + " y $" + max + ":");
                        for (Producto p : rangoPrecio) {
                            p.mostrarInfo();
                        }
                    }
                    break;

                case 9:
                    System.out.println("\n===== 9) Categorías disponibles y sus descripciones =====");
                    inventario.mostrarCategoriasDisponibles();
                    break;

                case 10:
                    System.out.println("\n===== 10 - Extra) Agregar un nuevo producto al inventario =====");
                    agregarProductoDesdeConsola(inventario);
                    break;

                case 0:
                    System.out.println("\nSaliendo del sistema de stock. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intentá nuevamente.");
            }

        } while (opcion != 0);
    }

    // ------------------- MÉTODOS AUXILIARES -------------------

    // Muestra el menú principal
    private static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("        SISTEMA DE STOCK - MENÚ         ");
        System.out.println("========================================");
        System.out.println("1. Listar todos los productos");
        System.out.println("2. Buscar producto por ID");
        System.out.println("3. Filtrar productos por categoría");
        System.out.println("4. Eliminar producto por ID");
        System.out.println("5. Actualizar stock de un producto");
        System.out.println("6. Mostrar total de stock disponible");
        System.out.println("7. Mostrar producto con mayor stock");
        System.out.println("8. Filtrar productos por rango de precio");
        System.out.println("9. Mostrar categorías disponibles");
        System.out.println("10. Agregar nuevo producto");
        System.out.println("0. Salir");
        System.out.println("========================================");
    }

    // Permite al usuario elegir una categoría del enum
    private static CategoriaProducto leerCategoriaDesdeUsuario() {
        System.out.println("Elegí una categoría:");
        CategoriaProducto[] categorias = CategoriaProducto.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i] + " - " + categorias[i].getDescripcion());
        }
        System.out.print("Opción: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Opción inválida. Ingresá un número.");
            scanner.next();
            System.out.print("Opción: ");
        }
        int opcionCat = scanner.nextInt();
        scanner.nextLine();

        if (opcionCat < 1 || opcionCat > categorias.length) {
            System.out.println("Opción de categoría inválida.");
            return null;
        }

        return categorias[opcionCat - 1];
    }

    // Agregar un producto pidiendo los datos por consola
    private static void agregarProductoDesdeConsola(Inventario inventario) {
        System.out.print("Ingresá el ID del producto: ");
        String id = scanner.nextLine();

        System.out.print("Ingresá el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresá el precio del producto: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor inválido. Ingresá un número (usar punto como separador decimal).");
            scanner.next();
            System.out.print("Ingresá el precio del producto: ");
        }
        double precio = scanner.nextDouble();

        System.out.print("Ingresá la cantidad en stock: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inválido. Ingresá un número entero.");
            scanner.next();
            System.out.print("Ingresá la cantidad en stock: ");
        }
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        CategoriaProducto categoria = leerCategoriaDesdeUsuario();
        if (categoria == null) {
            System.out.println("No se pudo crear el producto por categoría inválida.");
            return;
        }

        Producto nuevo = new Producto(id, nombre, precio, cantidad, categoria);
        inventario.agregarProducto(nuevo);
        System.out.println("Producto agregado correctamente:");
        nuevo.mostrarInfo();
    }
}