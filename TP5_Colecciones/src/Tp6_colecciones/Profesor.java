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
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // agregarCurso(Curso c) → agrega y sincroniza el lado del curso
    public void agregarCurso(Curso c) {
        if (c == null) return;

        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        // si el curso aún no tiene este profesor, lo sincronizamos
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    // eliminarCurso(Curso c) → quita y deja profesor en null si corresponde
    public void eliminarCurso(Curso c) {
        if (c == null) return;

        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    // listarCursos() → muestra códigos y nombres
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta cursos actualmente.");
        } else {
            System.out.println("Cursos dictados por " + nombre + ":");
            for (Curso curso : cursos) {
                System.out.println(" - " + curso.getCodigo() + " | " + curso.getNombre());
            }
        }
    }

    // mostrarInfo() → datos + cantidad de cursos
    public void mostrarInfo() {
        System.out.println("Profesor { " +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Especialidad='" + especialidad + '\'' +
                ", Cantidad de cursos=" + cursos.size() +
                " }");
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
