/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp2;

/**
 *
 * @author vallett
 */

import java.util.Locale;
import java.util.Scanner;

public class TP2Menu {

    // Scanner único para toda la app (no cerrar System.in)
    private static final Scanner SC = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elija una opción: ");
            System.out.println();
            switch (opcion) {
                case 1 -> ejercicioBisiesto();
                case 2 -> ejercicioMayorDeTres();
                case 3 -> ejercicioClasificacionEdad();
                case 4 -> ejercicioCalculadoraDescuentos();
                case 5 -> ejercicioSumaPares();
                case 6 -> ejercicioContadorClasificado();
                case 7 -> ejercicioValidarNota();
                case 8 -> ejercicioPrecioFinal();
                case 9 -> ejercicioEnvioTotal();
                case 10 -> ejercicioActualizarStock();
                case 11 -> ejercicioDescuentoEspecial();
                case 12 -> ejercicioModificarArrays();
                case 13 -> ejercicioRecursividadArrays();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Ejercicios TP2 ---");
        System.out.println(" 1. Verificar año bisiesto");
        System.out.println(" 2. Determinar el mayor de tres números");
        System.out.println(" 3. Clasificar por edad");
        System.out.println(" 4. Calculadora de descuentos (A/B/C)");
        System.out.println(" 5. Suma de pares (hasta ingresar 0)");
        System.out.println(" 6. Contador clasificado (10 números)");
        System.out.println(" 7. Validar nota (0 a 10)");
        System.out.println(" 8. Precio final (base + impuesto - descuento)");
        System.out.println(" 9. Envío total (zona + peso)");
        System.out.println("10. Actualizar stock");
        System.out.println("11. Descuento especial (constante)");
        System.out.println("12. Modificar arrays (asignación)");
        System.out.println("13. Recursividad con arrays (imprimir)");
        System.out.println(" 0. Salir");
    }

    /* =========================
       Utilidades de lectura
       ========================= */
    private static int leerEntero(String prompt) {
        System.out.print(prompt);
        while (!SC.hasNextInt()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            SC.next();
        }
        return SC.nextInt();
    }

    private static double leerDouble(String prompt) {
        System.out.print(prompt);
        while (!SC.hasNextDouble()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            SC.next();
        }
        return SC.nextDouble();
    }

    private static String leerToken(String prompt) {
        System.out.print(prompt);
        return SC.next();
    }

    /* =========================
       Ejercicio 1: Bisiesto
       ========================= */
    private static void ejercicioBisiesto() {
        int anio = leerEntero("Ingrese un año: ");
        boolean esBisiesto;
        if (anio % 400 == 0) {
            esBisiesto = true;
        } else if (anio % 100 == 0) {
            esBisiesto = false; // CORRECTO: divisible por 100 → NO bisiesto (salvo que sea %400==0)
        } else {
            esBisiesto = (anio % 4 == 0);
        }
        System.out.println("El año " + anio + (esBisiesto ? " es bisiesto." : " no es bisiesto."));
    }

    /* =====================================
       Ejercicio 2: Mayor de tres enteros
       ===================================== */
    private static void ejercicioMayorDeTres() {
        int a = leerEntero("Ingrese el primer número: ");
        int b = leerEntero("Ingrese el segundo número: ");
        int c = leerEntero("Ingrese el tercer número: ");

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
    }

    /* =====================================
       Ejercicio 3: Clasificación por edad
       ===================================== */
    private static void ejercicioClasificacionEdad() {
        int edad = leerEntero("Ingrese su edad: ");
        String clasificacion;
        if (edad < 12) {
            clasificacion = "Niño";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }
        System.out.println("Eres un " + clasificacion + ".");
    }

    /* =====================================
       Ejercicio 4: Calculadora de descuentos
       ===================================== */
    private static void ejercicioCalculadoraDescuentos() {
        double precio = leerDouble("Ingrese el precio del producto: ");
        String textoCat = leerToken("Ingrese la categoría (A, B o C): ");
        char categoria = Character.toUpperCase(textoCat.charAt(0));

        double porcentaje;
        if (categoria == 'A') {
            porcentaje = 0.10;
        } else if (categoria == 'B') {
            porcentaje = 0.15;
        } else if (categoria == 'C') {
            porcentaje = 0.20;
        } else {
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            return;
        }

        double descuento = precio * porcentaje;
        double precioFinal = precio - descuento;

        // redondeo a 2 decimales (monto final)
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;

        System.out.println("Descuento aplicado: " + (int) (porcentaje * 100) + "%");
        System.out.println("Monto de descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);
    }

    /* =====================================
       Ejercicio 5: Suma de pares (hasta 0)
       ===================================== */
    private static void ejercicioSumaPares() {
        int sumaPares = 0;
        while (true) {
            int n = leerEntero("Ingrese un número (0 para terminar): ");
            if (n == 0) break;
            if (n % 2 == 0) sumaPares += n;
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    /* =========================================
       Ejercicio 6: Contador clasificado (10 nº)
       ========================================= */
    private static void ejercicioContadorClasificado() {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            int n = leerEntero("Ingrese el número " + i + ": ");
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    /* =====================================
       Ejercicio 7: Validar nota (0 a 10)
       ===================================== */
    private static void ejercicioValidarNota() {
        int nota;
        do {
            nota = leerEntero("Ingrese una nota (0-10): ");
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Debe estar entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);
    }

    /* =========================================================
       Ejercicio 8: Precio final (base + impuesto - descuento)
       ========================================================= */
    private static void ejercicioPrecioFinal() {
        double precioBase = leerDouble("Ingrese el precio base: ");
        double impPorc = leerDouble("Impuesto % (ej: 10): ");
        double descPorc = leerDouble("Descuento % (ej: 5): ");

        double impuesto = impPorc / 100.0;
        double descuento = descPorc / 100.0;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);
    }

    private static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }

    /* =====================================
       Ejercicio 9: Envío total
       ===================================== */
    private static void ejercicioEnvioTotal() {
        double precio = leerDouble("Precio del producto: ");
        double peso = leerDouble("Peso del paquete (kg): ");
        String zona = leerToken("Zona (Nacional/Internacional): ");

        double envio = calcularCostoEnvio(peso, zona);
        if (envio < 0) {
            System.out.println("Zona inválida. Debe ser 'Nacional' o 'Internacional'.");
            return;
        }
        double total = calcularTotalCompra(precio, envio);

        System.out.printf("Costo de envío: %.2f%n", envio);
        System.out.printf("Total a pagar: %.2f%n", total);
    }

    private static double calcularCostoEnvio(double pesoKg, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return 5.0 * pesoKg;
        if (zona.equalsIgnoreCase("Internacional")) return 10.0 * pesoKg;
        return -1.0;
    }

    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /* =====================================
       Ejercicio 10: Actualizar stock
       ===================================== */
    private static void ejercicioActualizarStock() {
        int stockActual = leerEntero("Stock actual: ");
        int cantidadVendida = leerEntero("Cantidad vendida: ");
        int cantidadRecibida = leerEntero("Cantidad recibida (reposición): ");

        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    /* =====================================
       Ejercicio 11: Descuento especial
       ===================================== */
    private static final double DESCUENTO_ESPECIAL = 0.10; // 10%

    private static void ejercicioDescuentoEspecial() {
        double precio = leerDouble("Ingrese el precio del producto: ");
        double montoDescuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - montoDescuento;

        System.out.printf("Descuento aplicado (%.0f%%): %.2f%n", DESCUENTO_ESPECIAL * 100, montoDescuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);
    }

    /* =====================================
       Ejercicio 12: Modificar arrays
       ===================================== */
    private static void ejercicioModificarArrays() {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirArray(precios);
    }

    private static void imprimirArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("precio[" + i + "] = " + arr[i]);
        }
    }

    /* =====================================
       Ejercicio 13: Recursividad con arrays
       ===================================== */
    private static void ejercicioRecursividadArrays() {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirRec(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRec(precios, 0);
    }

    private static void imprimirRec(double[] arr, int i) {
        if (i >= arr.length) return;                 // caso base
        System.out.println("precio[" + i + "] = " + arr[i]);
        imprimirRec(arr, i + 1);                     // paso recursivo
    }
}


