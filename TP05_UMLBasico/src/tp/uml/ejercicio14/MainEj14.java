/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio14;

/**
 *
 * @author vallett
 */
public class MainEj14 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 14 — EditorVideo / Proyecto / Render ===");

        Proyecto p = new Proyecto("Documental de Viaje", 45);
        EditorVideo editor = new EditorVideo();

        // Dependencia de creación
        editor.exportar("MP4", p);
    }

}
