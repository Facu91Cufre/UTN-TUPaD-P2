/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    
    public Universidad(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
    
    public Profesor buscarProfesorPorId(String id){
        int i = 0;
        Profesor profesorBuscado = null;
        while(i < this.profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if(i < this.profesores.size()){
            profesorBuscado = this.profesores.get(i);
        }
        return profesorBuscado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        int i = 0;
        Curso cursoBuscado = null;
        while(i < this.cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
            i++;
        }
        if(i < this.cursos.size()){
            cursoBuscado = this.cursos.get(i);
        }
        return cursoBuscado;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profesorAAsignar = buscarProfesorPorId(idProfesor);
        Curso cursoAAsignar = buscarCursoPorCodigo(codigoCurso);
        if(cursoAAsignar != null && profesorAAsignar != null){
            cursoAAsignar.setProfesor(profesorAAsignar);
        }
    }
    
    public List<Profesor> listarProfesores(){
        return Collections.unmodifiableList(this.profesores);
    }
    
    public List<Curso> listarCursos(){
        return Collections.unmodifiableList(this.cursos);
    }
    
    public void eliminarCurso(Curso curso){
        Curso cursoAEliminar = buscarCursoPorCodigo(curso.getCodigo());
        if(cursoAEliminar != null){
            cursoAEliminar.setProfesor(null);
            this.cursos.remove(cursoAEliminar);
        }
    }
    
    public void eliminarProfesor(Profesor profesor){
        Profesor profesorAEliminar = buscarProfesorPorId(profesor.getId());
        if(profesorAEliminar != null){
            for (Curso curso : this.cursos) {
                if(curso.getProfesor() == profesorAEliminar){
                    curso.setProfesor(null);
                }  
            }
        }
        this.profesores.remove(profesorAEliminar);
    }
}
