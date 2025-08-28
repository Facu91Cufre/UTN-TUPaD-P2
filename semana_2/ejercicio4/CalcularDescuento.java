/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class CalcularDescuento {
    public static void main(String[] args) {
        /*Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
          Luego, aplique los siguientes descuentos:
          Categoría A: 10% de descuento
          Categoría B: 15% de descuento
          Categoría C: 20% de descuento
          El programa debe mostrar el precio original, el descuento aplicado y el precio final*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        double descuento = 0, total = precio;
        System.out.print("Ahora ingrese su categoria: ");
        char cat = input.nextLine().charAt(0);
        
        switch(cat) {
            case 'A':
                descuento = precio * 0.1;
                total = precio - descuento;
                break;
            case 'B':
                descuento = precio * 0.15;
                total = precio - descuento;
                break;
            case 'C':
                descuento = precio * 0.2;
                total = precio - descuento;
                break;
            default:
                break; 
        }
        System.out.println("El precio del producto es " + precio + ". El descuento según su categoría es: " +                        descuento + ". El total a pagar es " + total + ".");
    }
}
