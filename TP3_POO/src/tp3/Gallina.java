/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp3;

/**
 *
 * @author vallett
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edad);
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() { huevosPuestos++; }
    public void envejecer() { edad++; }

    public void mostrarEstado() {
        System.out.printf("Gallina %s | Edad: %d | Huevos puestos: %d%n",
                idGallina, edad, huevosPuestos);
    }
}
