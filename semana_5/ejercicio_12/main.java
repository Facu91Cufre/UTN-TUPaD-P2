/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

public class main {

    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Pablo Perez", "30123456789");
        Impuesto i = new Impuesto(10000, c);
        Calculadora calc = new Calculadora();
        
        calc.calcular(i);
    }
    
}
