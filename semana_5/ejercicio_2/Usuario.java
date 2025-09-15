/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

public class Usuario {
    private String nombre;
    private String DNI;
    private Celular celular;
    
    public Usuario(String nombre, String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public Celular getCelular(){
        return celular;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCelular(Celular celular){
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
  
}
