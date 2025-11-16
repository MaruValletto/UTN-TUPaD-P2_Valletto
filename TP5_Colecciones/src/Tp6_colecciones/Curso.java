/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp6_colecciones;

/**
 *
 * @author vallett
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // setProfesor(Profesor p) → sincroniza ambos lados
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return; // nada que hacer
        }

        // quitarse de la lista del profesor anterior (si había)
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.getCursos().remove(this);
        }

        // asignar nuevo profesor y agregar el curso a su lista
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    // mostrarInfo() → código, nombre y profesor si tiene
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso { " +
                "Código='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Profesor='" + nombreProfesor + '\'' +
                " }");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + (profesor != null ? profesor.getNombre() : "null") +
                '}';
    }
}
