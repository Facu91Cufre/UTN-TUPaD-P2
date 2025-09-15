/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

public class main {

    public static void main(String[] args) {
        
        Libro libro = new Libro("Cien Años de Soledad", "978-958-04-2471-3");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        
        System.out.println(libro);
        System.out.println(editorial);
        System.out.println(autor);
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        System.out.println(libro);
    }
    
}
