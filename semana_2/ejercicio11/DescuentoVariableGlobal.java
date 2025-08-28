/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class DescuentoVariableGlobal {
    static final double DESCUENTO_GLOBAL = 0.10;
    public static void main(String[] args) {
        /*Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%. Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("Descuento aplicado: $" + (precio - precioFinal));
        System.out.println("Total a pagar: $" + precioFinal);
    }
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioAPagar = precio - descuentoAplicado;
        return precioAPagar;
    }
}
