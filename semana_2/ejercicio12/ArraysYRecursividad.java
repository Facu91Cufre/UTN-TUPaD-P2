/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author facun
 */
public class ArraysYRecursividad {
    public static void main(String[] args) {
        /*Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.*/
        double[] precios = {100.50, 54.75, 99.99, 102.15};
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("Precio: $" + precio + " ");
        }
        precios[2] = 10.20;
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("Precio: $" + precio + " ");
        }
        System.out.println();
    }
}
