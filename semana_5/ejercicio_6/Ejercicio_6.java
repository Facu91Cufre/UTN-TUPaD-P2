/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

public class Ejercicio_6 {

    public static void main(String[] args) {
       
        Reserva reserva = new Reserva("16/09/2025", "20:30");
        Cliente cliente = new Cliente("Pepe Gomez", "1144442222");
        Mesa mesa = new Mesa(14, 2);
        
        System.out.println(cliente);
        System.out.println(reserva);
        System.out.println(mesa);
        
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        
        System.out.println(reserva);
    }
    
}
