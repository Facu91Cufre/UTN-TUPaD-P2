/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Vaca());
        
        for (Animal animal : animales) {
            System.out.println("Especie: " + animal.getEspecie() + "\nPatas: " + animal.getCantPatas());
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("----------");
        }
    }
    
}
