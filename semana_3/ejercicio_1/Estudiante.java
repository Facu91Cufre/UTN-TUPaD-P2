/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_1;

/**
 *
 * @author facun
 */
public class Estudiante {
    private String nombre = "Facundo";
    private String apellido = "Cufré";
    private String curso = "Programación II";
    private double calificacion;
    
    public void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    public void subirCalificacion(int puntos){
        calificacion += puntos;
    }
    
    public void bajarCalificacion(int puntos){
        calificacion -= puntos;
    }
}
