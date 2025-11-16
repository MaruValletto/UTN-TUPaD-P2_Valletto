/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;
import java.util.Scanner;


/**
 *
 * @author vallett
 */
public class SistemaUniversidad {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. Crear al menos 3 profesores y 5 cursos.
        System.out.println("\n===== 1) Creación de universidad, profesores y cursos =====");
        Universidad universidad = new Universidad("Universidad Tecnológica");

        Profesor prof1 = new Profesor("P001", "Ana López", "Bases de Datos");
        Profesor prof2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P003", "María Gómez", "Redes");

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        Curso c1 = new Curso("BD101", "Introducción a Bases de Datos");
        Curso c2 = new Curso("PR201", "Programación II");
        Curso c3 = new Curso("RD301", "Redes I");
        Curso c4 = new Curso("SO401", "Sistemas Operativos");
        Curso c5 = new Curso("AR501", "Arquitectura de Computadoras");

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
        System.out.println("\n===== 3) Asignación inicial de profesores a cursos =====");
        universidad.asignarProfesorACurso("BD101", "P001");
        universidad.asignarProfesorACurso("PR201", "P002");
        universidad.asignarProfesorACurso("RD301", "P003");
        universidad.asignarProfesorACurso("SO401", "P002");
        universidad.asignarProfesorACurso("AR501", "P003");

        System.out.println("Asignaciones iniciales realizadas.\n");

        // Menú para las tareas 4 a 8
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
                    // 4) Listar cursos con su profesor
                    System.out.println("\n===== 4) Listar cursos con su profesor =====");
                    universidad.listarCursos();
                    break;

                case 2:
                    // 4) Listar profesores con sus cursos
                    System.out.println("\n===== 4) Listar profesores con sus cursos =====");
                    universidad.listarProfesoresConCursos();
                    break;

                case 3:
                    // 5) Cambiar el profesor de un curso y verificar sincronización.
                    System.out.println("\n===== 5) Cambiar profesor de un curso =====");
                    System.out.print("Ingresá el código del curso: ");
                    String codCurso = scanner.nextLine();
                    System.out.print("Ingresá el ID del nuevo profesor: ");
                    String idProf = scanner.nextLine();

                    boolean asignado = universidad.asignarProfesorACurso(codCurso, idProf);
                    if (asignado) {
                        System.out.println("Profesor reasignado correctamente.");
                    } else {
                        System.out.println("No se pudo reasignar. Verificá código de curso y ID de profesor.");
                    }
                    break;

                case 4:
                    // 6) Remover un curso y confirmar que ya no aparece en la lista del profesor.
                    System.out.println("\n===== 6) Eliminar curso y verificar sincronización =====");
                    System.out.print("Ingresá el código del curso a eliminar: ");
                    String codEliminar = scanner.nextLine();
                    boolean eliminadoCurso = universidad.eliminarCurso(codEliminar);
                    if (eliminadoCurso) {
                        System.out.println("Curso eliminado correctamente.");
                        System.out.println("Cursos actuales de la universidad:");
                        universidad.listarCursos();
                    } else {
                        System.out.println("No se encontró un curso con código " + codEliminar);
                    }
                    break;

                case 5:
                    // 7) Remover un profesor y dejar profesor = null en sus cursos.
                    System.out.println("\n===== 7) Eliminar profesor y dejar cursos sin profesor =====");
                    System.out.print("Ingresá el ID del profesor a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    boolean eliminadoProf = universidad.eliminarProfesor(idEliminar);
                    if (eliminadoProf) {
                        System.out.println("Profesor eliminado correctamente.");
                        System.out.println("Cursos (para verificar que quedaron sin profesor si correspondía):");
                        universidad.listarCursos();
                    } else {
                        System.out.println("No se encontró un profesor con ID " + idEliminar);
                    }
                    break;

                case 6:
                    // 8) Mostrar reporte: cantidad de cursos por profesor.
                    System.out.println("\n===== 8) Reporte: cantidad de cursos por profesor =====");
                    universidad.mostrarReporteCursosPorProfesor();
                    break;

                case 0:
                    System.out.println("\nSaliendo del sistema de universidad. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intentá nuevamente.");
            }

        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("      SISTEMA UNIVERSIDAD - MENÚ        ");
        System.out.println("========================================");
        System.out.println("1. Listar cursos con su profesor");
        System.out.println("2. Listar profesores con sus cursos");
        System.out.println("3. Cambiar profesor de un curso");
        System.out.println("4. Eliminar curso");
        System.out.println("5. Eliminar profesor");
        System.out.println("6. Mostrar reporte de cursos por profesor");
        System.out.println("0. Salir");
        System.out.println("========================================");
    }
}