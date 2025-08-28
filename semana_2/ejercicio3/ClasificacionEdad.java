/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class ClasificacionEdad {
    public static void main(String[] args) {
       /*Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor" 
        */
       Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if(edad < 12){
            System.out.println("Eres un niño.");
        } else if(edad <= 17){
            System.out.println("Eres un adolescente.");
        } else if(edad <= 59){
            System.out.println("Eres un adulto.");
        } else{
            System.out.println("Eres un adulto mayor.");
        }
    }
}
