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
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // agregarProfesor(Profesor p)
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    // agregarCurso(Curso c)
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // buscarProfesorPorId(String id)
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // buscarCursoPorCodigo(String codigo)
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    // asignarProfesorACurso(String codigoCurso, String idProfesor)
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null || profesor == null) {
            return false;
        }

        curso.setProfesor(profesor); // usa el setProfesor del curso (sincroniza ambos lados)
        return true;
    }

    // listarProfesores()
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados en la universidad.");
        } else {
            System.out.println("Profesores de la universidad " + nombre + ":");
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }

    // listarCursos()
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos cargados en la universidad.");
        } else {
            System.out.println("Cursos de la universidad " + nombre + ":");
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }

    // 🔹 NUEVO: listar profesores con sus cursos
    public void listarProfesoresConCursos() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados en la universidad.");
            return;
        }
        System.out.println("Profesores y sus cursos:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    // eliminarCurso(String codigo) → rompe relación con el profesor
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null); // quita el curso de la lista del profesor
            }
            cursos.remove(curso);
            return true;
        }
        return false;
    }

    // eliminarProfesor(String id) → deja profesor = null en sus cursos
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // copiar la lista para evitar ConcurrentModificationException
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null); // esto lo saca también de la lista de cursos del profesor
            }
            profesores.remove(profesor);
            return true;
        }
        return false;
    }

    // reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores para mostrar reporte.");
            return;
        }
        System.out.println("===== Reporte: Cantidad de cursos por profesor =====");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}