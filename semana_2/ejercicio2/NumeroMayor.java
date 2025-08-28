/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayor = 0;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Por favor ingresa un numero: ");
            n = Integer.parseInt(input.nextLine());
            if(n > mayor) mayor  = n;
        }
        System.out.print("El numero mayor es: " + mayor + ".");
        System.out.println();
    }
}
