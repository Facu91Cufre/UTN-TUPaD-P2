/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_4;

/**
 *
 * @author facun
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos = 0;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("ID: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }
    
}
