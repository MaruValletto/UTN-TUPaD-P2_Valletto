/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio4;

/**
 *
 * @author vallett
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente titular; // Asociación con Cliente
    private Banco banco;     // Asociación con Banco

    // Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente titular, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
        this.banco = banco;

        // Establece la relación inversa: el cliente tiene esta tarjeta
        if (titular != null) {
            titular.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", titular=" + titular +
                ", banco=" + banco +
                '}';
    }

}
