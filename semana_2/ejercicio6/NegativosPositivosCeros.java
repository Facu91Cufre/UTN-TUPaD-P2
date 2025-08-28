/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class NegativosPositivosCeros {
    public static void main(String[] args) {
        /* Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y              cuántos son ceros. */
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int n = Integer.parseInt(input.nextLine());
            if(n > 0){
                pos++;
            } else if(n < 0){
                neg++;
            } else{
                ceros++;
            }
        }
        System.out.println("Números ingresados:\nPositivos: " + pos + "\nNegativos: " + neg + "\nCeros: " + ceros);
    }
}
