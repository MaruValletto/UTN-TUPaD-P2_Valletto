/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio8;

/**
 *
 * @author vallett
 */
public class FirmaDigital {
    private final String hash;     // representación segura de la firma
    private final String algoritmo;

    public FirmaDigital(String hash, String algoritmo) {
        this.hash = hash;
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "FirmaDigital{hash='" + hash + "', algoritmo='" + algoritmo + "'}";
    }

}
