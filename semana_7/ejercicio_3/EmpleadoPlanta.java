/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

public class EmpleadoPlanta extends Empleado{
    private double sueldoBasico;
    private double bono;

    public EmpleadoPlanta(double sueldoBasico, double bono, String nombre, String apellido, String CUIL) {
        super(nombre, apellido, CUIL);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoBasico + (this.bono / 12);
    }
}
