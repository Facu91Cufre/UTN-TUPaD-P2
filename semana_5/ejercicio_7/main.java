/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

public class main {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR-001");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla");
        Conductor conductor = new Conductor("Pedro Gomez", "LIC-789");
        
        System.out.println(motor);
        System.out.println(vehiculo);
        System.out.println(conductor);
        
        vehiculo.setMotor(motor);
        vehiculo.setConductor(conductor);
        System.out.println(vehiculo);
        
        System.out.println(vehiculo.getConductor().getNombre());
        
    }
    
}
