/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

public class main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Laura Martinez", "laura@email.com");
        FirmaDigital firma = new FirmaDigital("ABC123XYZ", "19/09/2025");
        Documento documento = new Documento("Contrato de Alquiler", "Contenido del contrato...", firma);
        
        firma.setUsuario(user);
        
        System.out.println(firma);
        System.out.println(user);
        System.out.println(documento);
    }
}
