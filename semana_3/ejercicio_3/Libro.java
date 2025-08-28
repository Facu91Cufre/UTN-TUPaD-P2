/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_3;

/**
 *
 * @author facun
 */
public class Libro {
   private String titulo = "Cien Años de Soledad";
   private String autor = "Gabriel García Márquez";
   private int anioPublicacion = 1967;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
        }
    }
   
    
}
