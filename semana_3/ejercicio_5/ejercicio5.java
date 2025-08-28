/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_5;

/**
 *
 * @author facun
 */
public class ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial n1 = new NaveEspacial();
        n1.setNombre("Ricarda");
        n1.setCombustible(50);
        
        n1.mostrarEstado();
        n1.avanzar(60);
        n1.recargarCombustible(20);
        n1.mostrarEstado();
        n1.avanzar(60);
        
        n1.mostrarEstado();
    }  
}
