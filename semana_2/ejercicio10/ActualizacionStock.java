/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ActualizacionStock {
    public static void main(String[] args) {
        /*Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo              stock después de una venta y recepción de productos:
            NuevoStock = StockActual − CantidadVendida + CantidadRecibida
            NuevoStock = CantidadVendida + CantidadRecibida
            Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el                  stock actualizado.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual: ");
        int stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int productosVendidos = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad de productos recibidos: ");
        int productosRecibidos = Integer.parseInt(input.nextLine());
        int stockActualizado = actualizarStock(stockActual, productosVendidos, productosRecibidos);
        System.out.println("El stock actualizado es de: " + stockActualizado + ".");
    }
    public static int actualizarStock(int stock, int ventas, int entradas){
        int nuevoStock = stock - ventas + entradas;
        return nuevoStock;
    }
}
