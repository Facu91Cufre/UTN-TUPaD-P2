/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public abstract class Animal {
    private String especie;
    private int cantPatas;

    public Animal(String especie, int cantPatas) {
        this.especie = especie;
        this.cantPatas = cantPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public int getCantPatas() {
        return cantPatas;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido genérico de animal.");
    }
    
    public abstract void describirAnimal();
}
