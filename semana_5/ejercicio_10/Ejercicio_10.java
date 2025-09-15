/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

public class Ejercicio_10 {

    public static void main(String[] args) {
        
        Titular titular = new Titular("Pedro Gomez", "12345678");
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "01/09/2025");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 50000, clave);
        
        titular.setCuentaBancaria(cuenta);
        System.out.println(titular);
        System.out.println(clave);
        System.out.println(cuenta);
        
        System.out.println(titular.getCuentaBancaria().getCbu());
    }
    
}
