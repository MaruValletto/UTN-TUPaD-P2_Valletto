/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public class Kata4Main {

    public static void main(String[] args) {

        System.out.println("===== KATA 4 - Animales y Polimorfismo =====");

        Animal a1 = new Perro("Firulais");
        Animal a2 = new Gato("Mishito");
        Animal a3 = new Vaca("Lola");

        Animal[] animales = { a1, a2, a3 };

        System.out.println("Los animales hacen sus sonidos:");

        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();  // polimorfismo: se ejecuta el método de la subclase real
            System.out.println("---------------------------------");
        }

        System.out.println("===== Fin KATA 4 =====");
    }
}