/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_4.ejercicio_1;

/**
 *
 * @author facun
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario ){
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto){
        this(totalEmpleados + 1,nombre, puesto, 0);
    }
    
    public void actualizarSalario(double porcentaje){
        this.salario += salario * porcentaje / 100;
    }
    public void actualizarSalario(){
        this.salario += 1000.00;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario= $" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
