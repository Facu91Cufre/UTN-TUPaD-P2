/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

public class main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Pedro", "pedro@email.com");
        Usuario user2 = new Usuario("Mario", "mario@email.com");
        
        GeneradorQR generador = new GeneradorQR();
        
        generador.generar("Codigo 1", user1);
        generador.generar("Codigo 2", user2);
    }
    
}
