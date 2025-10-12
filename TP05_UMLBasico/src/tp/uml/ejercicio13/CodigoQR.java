/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio13;

/**
 *
 * @author vallett
 */
// Asociación unidireccional: el CódigoQR conoce al Usuario
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + usuario + "}";
    }

}
