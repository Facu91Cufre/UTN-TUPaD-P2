/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Artista artista = new Artista("Gustavo Cerati", "Rock");
        Cancion cancion = new Cancion("De musica ligera", artista);
        Reproductor reproductor = new Reproductor();
        
        System.out.println(cancion);
        System.out.println(artista);
        reproductor.reproducir(cancion);
    }
    
}
