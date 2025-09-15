/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author facun
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Foto foto = new Foto("4x4", "jpg");
        Titular titular = new Titular("Facundo Cufre", "36169652");
        Pasaporte pasaporte = new Pasaporte("AB2869", "12/09/2025", foto);
        
        pasaporte.setTitular(titular);
        System.out.println(pasaporte);
        System.out.println(pasaporte.getTitular().getNombre());
        System.out.println(titular.getPasaporte().getNumero());
    }
    
}
