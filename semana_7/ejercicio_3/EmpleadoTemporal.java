/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

public class EmpleadoTemporal extends Empleado{
    private double precioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(double precioPorHora, int horasTrabajadas, String nombre, String apellido, String CUIL) {
        super(nombre, apellido, CUIL);
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * precioPorHora;
    } 
}
