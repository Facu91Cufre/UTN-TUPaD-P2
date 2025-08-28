/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ValidarNota {
    public static void main(String[] args) {
        /* Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango,        debe seguir pidiéndole la nota hasta que ingrese un valor válido. */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nota: ");
        double nota = Double.parseDouble(input.nextLine());
        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida. Ingrese una nota entre 0 y 10: ");
            nota = Double.parseDouble(input.nextLine());
        }
    }
}
