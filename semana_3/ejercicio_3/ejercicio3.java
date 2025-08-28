/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_3;

/**
 *
 * @author facun
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        
        System.out.println(l1.getTitulo() + " " + l1.getAutor() + " " + l1.getAnioPublicacion());
        
        l1.setAnioPublicacion(-5);
        System.out.println(l1.getAnioPublicacion());
        
        l1.setAnioPublicacion(2025);
        System.out.println(l1.getAnioPublicacion());
        
        System.out.println(l1.getTitulo() + " " + l1.getAutor() + " " + l1.getAnioPublicacion());
    }
}
