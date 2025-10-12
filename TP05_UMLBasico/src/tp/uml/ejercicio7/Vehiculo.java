/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp.uml.ejercicio7;

/**
 *
 * @author vallett
 */

// COMPOSICIÓN con Motor + ASOCIACIÓN con Conductor
public class Vehiculo {
    private final String marca;
    private final String modelo;
    private final Motor motor;        // composición (lo crea el vehiculo)
    private final Conductor conductor; // asociación

    public Vehiculo(String marca, String modelo, String tipoMotor, int potenciaHP,
                    Conductor conductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor, potenciaHP); // composición: se crea aquí
        this.conductor = conductor;
        if (conductor != null) conductor.setVehiculo(this); // cierra lazo bidi
    }

    @Override
    public String toString() {
        return "Vehiculo{marca='" + marca + "', modelo='" + modelo +
               "', motor=" + motor + ", conductor=" + conductor + "}";
    }

}
