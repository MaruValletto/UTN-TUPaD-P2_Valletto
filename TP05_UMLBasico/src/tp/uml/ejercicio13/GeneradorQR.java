/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio13;

/**
 *
 * @author vallett
 */
/**
 * Dependencia de creación:
 * El método generar(...) crea un CódigoQR pero NO lo almacena como atributo.
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // creación
        System.out.println("✅ Código QR generado: " + qr);
    }

}
