/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio1;

/**
 *
 * @author vallett
 */
// Parte del Pasaporte (COMPOSICIÓN 1:1)
public class Foto {
private final String imagen;   // p.ej. "/fotos/pasaporte-ana.jpg"
    private final String formato;  // "JPG", "PNG"

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
    }
}
