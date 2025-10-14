/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Universidad utn = new Universidad("Universidad Tecnologica Nacional");
        
        Profesor p1 = new Profesor("P101", "Dr. López", "Algoritmos");
        Profesor p2 = new Profesor("P102", "Ing. Gómez", "Base de Datos");
        Profesor p3 = new Profesor("P103", "Lic. García", "POO");
        
        Curso c1 = new Curso("C201", "Programación I");
        Curso c2 = new Curso("C202", "Estructuras de Datos");
        Curso c3 = new Curso("C301", "Base de Datos I");
        Curso c4 = new Curso("C302", "Análisis de Sistemas");
        Curso c5 = new Curso("C401", "POO Avanzada");
        
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        utn.asignarProfesorACurso("C201", "P101");
        utn.asignarProfesorACurso("C202", "P101");
        utn.asignarProfesorACurso("C301", "P102");
        utn.asignarProfesorACurso("C401", "P103");
        
        utn.asignarProfesorACurso("C201", "P103");
        listarCursos(utn);
        listarProfesores(utn);
        
        utn.eliminarCurso(c5);
        
        utn.eliminarProfesor(p1);
        listarProfesores(utn);
        listarCursos(utn);
        
        for (Profesor profesor : utn.listarProfesores()) {
            System.out.println("Profesor: " + profesor.getNombre() + "\nCursos: " + profesor.listarCursos().size());
        }
    }  
    
    private static void listarCursos(Universidad u){
        for(Curso curso : u.listarCursos()){
            System.out.println("Curso: " + curso.getNombre() + "\nCodigo: " + curso.getCodigo());
            if(curso.getProfesor() != null){
                System.out.println("Profesor: " + curso.getProfesor().getNombre());
            } else{
                System.out.println("Profesor: N/A");
            }
            System.out.println("----------");
        }      
    }
    
    private static void listarProfesores(Universidad u){
        for(Profesor profesor : u.listarProfesores()){
            System.out.println("Profesor: " + profesor.getNombre() + "\nId: " + profesor.getId() + "\nEspecialidad: " + profesor.getEspecialidad());
            if(!profesor.listarCursos().isEmpty()){
                System.out.println("--Cursos dictados--");
                for (Curso curso : profesor.listarCursos()) {
                    System.out.println("Curso: " + curso.getNombre() + "\nCodigo: " + curso.getCodigo());  
                }
            }
                System.out.println("----------");
        }
    }
    
}
