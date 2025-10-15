/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String CUIL;

    public Empleado(String nombre, String apellido, String CUIL) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CUIL = CUIL;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public abstract double calcularSueldo();
}
