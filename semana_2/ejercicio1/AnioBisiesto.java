/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class AnioBisiesto {
    static final int FLAG = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor ingrese un anio: ");
        int anio = Integer.parseInt(input.nextLine());
        while(anio != 0){
            if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
                System.out.println(anio + " es bisiesto.");
            } else{
                System.out.println(anio + " no es bisiesto.");
            }
            System.out.print("Por favor ingrese otro anio o 0 para salir: ");
            anio = Integer.parseInt(input.nextLine());
        }
    }
}
