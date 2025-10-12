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
        // si el ID ingresado es mayor al actual, se actualiza el siguiente ID disponible
        if (id >= nextId) nextId = id + 1;
    }

    // Constructor sobrecargado: sólo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;           // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 300000.0;      // salario por defecto
        totalEmpleados++; // suma al total de empleados
    }

    // Métodos sobrecargados para actualizar salario
    // Opción 1: aumento por porcentaje
    public void actualizarSalario(double porcentajeAumento) {
        // ejemplo: 10.0 => 10%
        this.salario += this.salario * (porcentajeAumento / 100.0);
    }
    // Opción 2: aumento por monto fijo
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // Getters y Setters (permiten acceder y modificar los atributos de forma controlada)
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método estático requerido:  muestra cuántos empleados se han creado en total
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Representación legible (//️toString(): muestra la información del objeto en formato legible)
    @Override
    public String toString() {
        // Formatea el salario con separador de miles y dos decimales
        String salarioFmt = String.format(
            java.util.Locale.forLanguageTag("es-AR"),
            "%,.2f", salario
        );
        
        return "Empleado { id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + String.format("%.2f", salario) +
               " }";
        
    }
}
