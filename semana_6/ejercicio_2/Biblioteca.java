/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        this.libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public List<Libro> listarLibros(){
        return this.libros;
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        int i = 0;
        Libro libroBuscado = null;
        while(i < this.libros.size() && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
            i++;
        }
        if(i < this.libros.size()){
            libroBuscado = this.libros.get(i);
        }
        return libroBuscado;
    }
    
    public void eliminarLibro(String isbn){
        Libro libro = buscarLibroPorIsbn(isbn);
        if(libro != null){
            this.libros.remove(libro);
        }
    }
    
    public int obtenerCantidadLibros(){
        return this.libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> listaFiltrada = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio){
                listaFiltrada.add(libro);
            }
        }
        return listaFiltrada;
    }
    
    public List<Autor> mostrarAutoresDisponibles(){
        List<Autor> autoresDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autorActual = libro.getAutor();
            if(!autoresDisponibles.contains(autorActual)){
                autoresDisponibles.add(autorActual);
            }
        }
        return autoresDisponibles;
    }
}
