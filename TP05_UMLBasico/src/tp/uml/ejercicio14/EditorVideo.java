/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio14;

/**
 *
 * @author vallett
 */
/**
 * Dependencia de creación:
 * El método exportar crea un Render y lo utiliza, pero no lo guarda.
 */
public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // creación
        System.out.println("🎬 Exportando proyecto...");
        System.out.println("Render generado: " + render);
    }

}
