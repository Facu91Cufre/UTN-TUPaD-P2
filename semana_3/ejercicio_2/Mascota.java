/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_2;

/**
 *
 * @author facun
 */
public class Mascota {
    private String nombre = "Mila";
    private String especie = "Gato";
    private int edad = 1;
    
    public void mostrarInfo(){
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    public void cumplirAnios(){
        edad++;
    }
}
