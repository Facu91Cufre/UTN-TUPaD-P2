/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor p){
        if(this.profesor == p){
            return;
        }
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = p;
        
        if(p != null && !p.listarCursos().contains(this)){
            p.agregarCurso(this);
        }  
    }
    
    public Profesor getProfesor(){
            return this.profesor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
}
