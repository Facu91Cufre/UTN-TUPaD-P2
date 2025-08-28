/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class SumaNumerosPares {
    public static void main(String[] args) {
        /* Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta               que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados. */
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor ingrese un número: ");
        int n = Integer.parseInt(input.nextLine());
        int total = 0;
        while(n != 0){
            if(n % 2 == 0){
                total += n;
            } 
            System.out.print("Ingrese otro numero o 0 para terminar: ");
            n = Integer.parseInt(input.nextLine());
        }
        System.out.println("El total de la suma de los números pares ingresados es: " + total + ".");
    }
}
