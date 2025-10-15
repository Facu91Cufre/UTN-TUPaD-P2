/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta(400000, 50000, "Juan", "Perez", "20-12345678-9"));
        empleados.add(new EmpleadoTemporal(2500, 160, "Maria", "Gomez", "27-87654321-0"));
        empleados.add(new EmpleadoPlanta(600000, 80000, "Carlos", "Lopez", "20-22334455-6"));
        
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
            System.out.println("Sueldo: $" + empleado.calcularSueldo());
            if(empleado instanceof EmpleadoPlanta){
                System.out.println("Empleado de planta.");
            } else if(empleado instanceof EmpleadoTemporal){
                System.out.println("Empleado temporal.");
            }
            System.out.println("----------");
        }
    }
    
}
