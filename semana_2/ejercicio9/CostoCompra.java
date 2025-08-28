/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class CostoCompra {
    public static void main(String[] args) {
        /* a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o            Internacional) y el peso del paquete.
            Nacional: $5 por kg
            Internacional: $10 por kg
            b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del            producto con el costo de envío.
            Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a            pagar. */
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del producto: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese zona de envío (Internacional o Nacional): ");
        String zona = input.nextLine();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El total de la compra es de: $" + total + ".");
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costo;
        if(zona.equals("Nacional")){
            costo = peso * 5;
        } else{
            costo = peso * 10;
        }
        return costo;
    }
    public static double calcularTotalCompra(double precio, double envio){
        double totalCompra = precio + envio;
        return totalCompra;
    }
}
