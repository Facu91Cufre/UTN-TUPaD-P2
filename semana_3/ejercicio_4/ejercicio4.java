/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_4;

/**
 *
 * @author facun
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina(1);
        gallina1.setEdad(3);
        
        gallina2.setIdGallina(2);
        gallina2.setEdad(2);
        
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
