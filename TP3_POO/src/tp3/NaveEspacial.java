/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp3;

/**
 *
 * @author vallett
 */
public class NaveEspacial {
    private final String nombre;
    private int combustible;
    private boolean enVuelo;
    private static final int CAPACIDAD_MAX = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(Math.max(0, combustibleInicial), CAPACIDAD_MAX);
        this.enVuelo = false;
    }

    public void despegar() {
        int costoDespegue = 10;
        if (enVuelo) {
            System.out.println("La nave ya está en vuelo.");
            return;
        }
        if (combustible >= costoDespegue) {
            combustible -= costoDespegue;
            enVuelo = true;
            System.out.println("Despegue exitoso.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println("La nave no está en vuelo. Debe despegar primero.");
            return;
        }
        if (distancia <= 0) {
            System.out.println("Distancia inválida.");
            return;
        }
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("Avance completado: " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente. Disponible: " + combustible);
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(CAPACIDAD_MAX, combustible + cantidad);
        System.out.printf("Recarga: %d → %d (cap máx %d)%n", antes, combustible, CAPACIDAD_MAX);
    }

    public void mostrarEstado() {
        System.out.printf("Nave %s | Combustible: %d/%d | En vuelo: %b%n",
                nombre, combustible, CAPACIDAD_MAX, enVuelo);
    }
}