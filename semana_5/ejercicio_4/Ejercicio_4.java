/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

public class Ejercicio_4 {

    public static void main(String[] args) {
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/2028");
        Cliente cliente = new Cliente("Pepe Gomez", "12345678");
        Banco banco = new Banco("Banco Nacion", "30-99999999-1");
        
        tarjeta.setCliente(cliente);
        tarjeta.setBanco(banco);
        
        System.out.println(banco);
        System.out.println(cliente);
        
        System.out.println(tarjeta);
        System.out.println(cliente.getTarjeta().getNumero());
    }
    
}
