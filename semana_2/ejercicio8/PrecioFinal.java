/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class PrecioFinal {
    public static void main(String[] args) {
        /* Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto             en un e-commerce. La fórmula es:
            PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase            \times Impuesto) - (PrecioBase \times Descuento)
            Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento,                 llama al método y muestra el precio final.*/
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento;
        System.out.print("Ingrese el precio del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto: ");
        impuesto = Double.parseDouble(input.nextLine()) / 100;
        System.out.print("Ingrese el descuento: ");
        descuento = Double.parseDouble(input.nextLine()) / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + precioFinal + ".");
    }
    public static double calcularPrecioFinal(double precio, double impuesto, double descuento){
        double resultado = precio + (precio * impuesto) - (precio * descuento);
        return resultado;
    }
}
