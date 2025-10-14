/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Alejandria");
        
        Autor a1 = new Autor("A101", "Gabriel Garcia Marquez", "Colombiano");
        Autor a2 = new Autor("A102", "Jane Austen", "Britanica");
        Autor a3 = new Autor("A103", "Jorge Luis Borges", "Argentino");
        
        biblioteca.agregarLibro("978-9588907001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("978-0141439518", "Orgullo y prejuicio", 1813, a2);
        biblioteca.agregarLibro("978-9875667798", "Ficciones", 1944, a3);
        biblioteca.agregarLibro("978-0140182479", "El Aleph", 1949, a3);
        biblioteca.agregarLibro("978-9875806449", "Cronica de una muerte anunciada", 1981, a1);
        
        //mostrarPorConsola(biblioteca);
        
        /*Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-0140182479");
        if(libroBuscado != null){
            libroBuscado.mostrarInfo();
        }*/
        
        /*List<Libro> listaFiltrada = biblioteca.filtrarLibrosPorAnio(1949);
        mostrarPorConsola(listaFiltrada);*/
        
        /*biblioteca.eliminarLibro("978-0141439518");
        mostrarPorConsola(biblioteca);*/
        
        //System.out.println(biblioteca.obtenerCantidadLibros());
        
        List<Autor> autores = biblioteca.mostrarAutoresDisponibles();
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
    }
    
    private static void mostrarPorConsola(Biblioteca biblioteca){
        List<Libro> libros = biblioteca.listarLibros();
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    private static void mostrarPorConsola(List<Libro> lista){
        for (Libro libro : lista) {
            libro.mostrarInfo();
        }
    }
}
