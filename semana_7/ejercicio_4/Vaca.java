/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class Vaca extends Animal{

    public Vaca() {
        super("Vaca", 4);
    }

    @Override
    public void describirAnimal() {
        System.out.println("Soy un mamífero herbívoro y rumiante de gran tamaño, criado comúnmente en granjas por mi aporte de leche y carne en la alimentación.");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Muuuuu!");
    }
}
