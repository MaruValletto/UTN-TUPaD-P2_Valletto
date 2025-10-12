/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio10;

/**
 *
 * @author vallett
 */
// Parte interna de Cuenta (COMPOSICIÓN)
public class Clave {
    private final String valorHash; // nunca guardes texto plano en la vida real
    private final String algoritmo;

    public Clave(String valorHash, String algoritmo) {
        this.valorHash = valorHash;
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "Clave{hash='" + valorHash + "', algoritmo='" + algoritmo + "'}";
    }

}
