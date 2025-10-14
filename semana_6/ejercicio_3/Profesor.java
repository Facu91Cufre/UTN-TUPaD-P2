/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void agregarCurso(Curso curso){
        if(curso != null && !cursos.contains(curso)){
            cursos.add(curso);
        }
    }
    
    public void eliminarCurso(Curso curso){
        if(curso != null && cursos.contains(curso)){
            cursos.remove(curso);
        }
    }
    
    public List<Curso> listarCursos(){
        return Collections.unmodifiableList(cursos);
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
