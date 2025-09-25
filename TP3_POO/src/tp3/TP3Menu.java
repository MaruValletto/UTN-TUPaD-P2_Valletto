/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp3;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vallett
 */
public class TP3Menu {
    private static final Scanner SC = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int op;
        do {
            mostrarMenu();
            op = leerInt("Elija una opción: ");
            System.out.println();
            switch (op) {
                case 1 -> demoEstudiante();
                case 2 -> demoMascota();
                case 3 -> demoLibro();
                case 4 -> demoGallinas();
                case 5 -> demoNave();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (op != 0);
    }

    private static void mostrarMenu() {
        System.out.println("=== TP3 – POO ===");
        System.out.println("1) Registro de Estudiantes");
        System.out.println("2) Registro de Mascotas");
        System.out.println("3) Encapsulamiento con Libro");
        System.out.println("4) Gestión de Gallinas");
        System.out.println("5) Simulación de Nave Espacial");
        System.out.println("0) Salir");
    }

    private static int leerInt(String p) {
        System.out.print(p);
        while (!SC.hasNextInt()) { System.out.print("Valor inválido: "); SC.next(); }
        return SC.nextInt();
    }

    /* ===== Demos ===== */

    private static void demoEstudiante() {
    Estudiante e = new Estudiante("Marianela", "Valletto", "Programación II", 7.5);
    e.mostrarInfo();                // muestra datos iniciales
    e.subirCalificacion(1.0);       // aumenta
    e.mostrarInfo();
    e.bajarCalificacion(2.0);       // disminuye
    e.mostrarInfo();
   }

    private static void demoMascota() {
        Mascota m = new Mascota("Luna", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
    }

    private static void demoLibro() {
        Libro l = new Libro("El Principito", "A. de Saint-Exupéry", 1943);
        l.mostrarInfo();
        System.out.println("Intento inválido de cambiar el año a 3000:");
        l.setAnioPublicacion(3000); // inválido
        l.mostrarInfo();
        System.out.println("Cambio válido a 1950:");
        l.setAnioPublicacion(1950); // válido
        l.mostrarInfo();
    }

    private static void demoGallinas() {
        Gallina g1 = new Gallina("G-001", 1);
        Gallina g2 = new Gallina("G-002", 2);
        g1.envejecer(); g1.ponerHuevo(); g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    private static void demoNave() {
        NaveEspacial n = new NaveEspacial("Andrómeda", 50);
        n.mostrarEstado();
        System.out.println("Intentar avanzar sin despegar:");
        n.avanzar(10);
        System.out.println("Despegar:");
        n.despegar();
        System.out.println("Avanzar 60 (puede faltar combustible):");
        n.avanzar(60);
        System.out.println("Recargar 40:");
        n.recargarCombustible(40);
        System.out.println("Avanzar 30:");
        n.avanzar(30);
        n.mostrarEstado();
    }
}
