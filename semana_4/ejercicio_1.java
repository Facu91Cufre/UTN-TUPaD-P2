/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_4.ejercicio_1;

/**
 *
 * @author facun
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Facundo", "Junior", 10000);
        System.out.println(Empleado.mostrarTotalEmpleados());
        Empleado e2 = new Empleado(2, "Felipe", "Senior", 24000);
        System.out.println(Empleado.mostrarTotalEmpleados());
        Empleado e3 = new Empleado("Karla", "Junior");
        System.out.println(Empleado.mostrarTotalEmpleados());
        e1.actualizarSalario();
        e2.actualizarSalario(20);
        e3.actualizarSalario();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
