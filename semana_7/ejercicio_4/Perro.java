/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class Perro extends Animal{

    public Perro() {
        super("Perro", 4);
    }

    @Override
    public void describirAnimal() {
        System.out.println("Soy un mamífero doméstico, conocido como \"el mejor amigo del hombre\" por mi lealtad, inteligencia y gran capacidad para la compañía.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau!");
    }
}
