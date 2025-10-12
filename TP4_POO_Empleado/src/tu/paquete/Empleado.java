/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tu.paquete;

/**
 *
 * @author vallett
 */
public class Empleado {
// Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributos/métodos de clase (estáticos)
    private static int totalEmpleados = 0;
    private static int nextId = 1; // para asignar id automático

    // Constructor completo: recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                 // uso de this para distinguir parámetros/atributos
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;             // ambos constructores incrementan el total
        // opcional: mantener nextId coherente si pasan un id manual mayor
        if (id >= nextId) nextId = id + 1;
    }

    // Constructor sobrecargado: sólo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;           // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 300000.0;      // salario por defecto (ajustá si querés)
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentajeAumento) {
        // ejemplo: 10.0 => 10%
        this.salario += this.salario * (porcentajeAumento / 100.0);
    }

    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // Getters y Setters (encapsulamiento)
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método estático requerido
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Representación legible
    @Override
    public String toString() {
        return "Empleado { id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + String.format("%.2f", salario) +
               " }";
    }
}
