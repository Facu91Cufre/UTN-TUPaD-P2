/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

public class Main {

    public static void main(String[] args) {
       Figura[] figuras = new Figura[4];
       
       figuras[0] = new Circulo(5.5, "Circulo A");
       figuras[1] = new Rectangulo(2, 4, "Rectanculo A");
       figuras[2] = new Circulo(9.2, "Circulo B");
       figuras[3] = new Rectangulo(8.5, 2.6, "Rectangulo B");
       
        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getNombre() + "\nArea: " + figura.calcularArea());
        }
    }
    
}
