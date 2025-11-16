/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tp7_HerenciaPolimorfismo;

/**
 *
 * @author vallett
 */
public class Kata2Main {

    public static void main(String[] args) {

        System.out.println("===== KATA 2 - Figuras y Métodos Abstractos =====");

        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 7);

        // Polimorfismo: array de tipo Figura que contiene distintos objetos
        Figura[] figuras = { f1, f2 };

        System.out.println("Mostrando información de las figuras:");

        for (Figura fig : figuras) {
            fig.mostrarInfo();   // Llama al método correcto según el objeto real
        }

        System.out.println("===== Fin KATA 2 =====");
    }
}