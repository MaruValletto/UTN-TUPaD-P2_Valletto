/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio2;

/**
 *
 * @author vallett
 */

// AGREGACIÓN con Bateria + Asociación bidireccional con Usuario
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación (inyectada)
    private Usuario usuario; // asociación

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // se pasa desde afuera (no la crea el celular)
        this.usuario = usuario;
        if (usuario != null) usuario.setCelular(this); // bidireccional
    }

    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo +
               "', bateria=" + bateria + ", usuario=" + usuario + "}";
    }
}
