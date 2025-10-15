/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class Gato extends Animal{

    public Gato() {
        super("Gato", 4);
    }

    @Override
    public void describirAnimal() {
        System.out.println("Soy un mamífero felino, un depredador doméstico valorado por mi independencia y agilidad, conocido por mi característico ronroneo.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Miau miau!");
    }
}
