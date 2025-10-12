/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio14;

/**
 *
 * @author vallett
 */
// Asociación unidireccional: Render conoce al Proyecto
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + proyecto + "}";
    }

}
