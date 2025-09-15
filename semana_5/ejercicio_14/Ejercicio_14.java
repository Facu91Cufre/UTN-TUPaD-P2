/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14;

public class Ejercicio_14 {

    public static void main(String[] args) {
        
        Proyecto proyecto1 = new Proyecto("VideoTutorial", 15);
        Proyecto proyecto2 = new Proyecto("Cortometraje", 10);
        
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4", proyecto1);
        editor.exportar("AVI", proyecto2);
        
        
    }
    
}
