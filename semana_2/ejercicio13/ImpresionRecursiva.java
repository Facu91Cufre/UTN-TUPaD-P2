/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author facun
 */
public class ImpresionRecursiva {
    public static void main(String[] args) {
        /*Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.*/
        double[] precios = {99.99, 14.50, 50.10};
        System.out.println("Precios originales: ");
        funcionRecursiva(precios, 0);
        precios[2] = 5.50;
        System.out.println("Precios actualizados: ");
        funcionRecursiva(precios, 0);
    }
    public static void funcionRecursiva(double[] array, int indice){
        if(indice < array.length){
            System.out.println(array[indice]);
            funcionRecursiva(array, indice + 1);
        }
    }
}
