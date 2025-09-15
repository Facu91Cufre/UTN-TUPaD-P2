/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

public class main {

    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("Asus ROG Strix", "Z790");
        Computadora pc = new Computadora("Dell", "D123456789", placa);
        Propietario propietario = new Propietario("Pepe", "12345678");
        
        System.out.println(placa);
        System.out.println(pc);
        System.out.println(propietario);
        
        pc.setPropietario(propietario);
        System.out.println(pc);
        System.out.println(propietario.getComputadora().getMarca());
    }
    
}
