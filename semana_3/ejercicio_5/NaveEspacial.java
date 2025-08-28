/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3_ejercicios.ejercicio_5;

/**
 *
 * @author facun
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int distanciaRecorrida;

    public void setNombre(String nombre) {
        if(nombre != null) {
        this.nombre = nombre;
        }
    }

    public void setCombustible(int combustible) {
        if(combustible > 0){
        this.combustible = combustible;
        }
    }
    
    
    public void despegar(){
        System.out.println("La nave ha despegado con éxito!!");
    }
    
    public boolean chequearCombustible(int distancia){
        return distancia <= combustible;
    }
    
    public void avanzar(int distancia){
        if(chequearCombustible(distancia)){
            System.out.println("La nave ha avanzado.");
            distanciaRecorrida += distancia;
            combustible -= distancia;
        } else{
            System.out.println("No hay suficiente combustible para ese trayecto, por favor recargue antes de avanzar.");
        }
    }
    
    public void recargarCombustible(int carga){
        if(carga > 0) {
            combustible += carga;
        } else{
            System.out.println("Ingrese un valor positivo.");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre 
                + "\nCombustible disponible: " + combustible 
                + "\nDistancia Recorrida: " + distanciaRecorrida + ".");
    }
}
