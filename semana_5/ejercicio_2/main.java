/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

public class main {

    public static void main(String[] args) {
       
        Bateria bateria = new Bateria("Li-Ion", 3000);
        Celular celular = new Celular("123456789","Samsung", "Galaxy S23");
        Usuario usuario = new Usuario("Facundo Cufre", "36169652");
        
        celular.setUsuario(usuario);
        
        System.out.println(celular);
        celular.encenderCelular();
        
        celular.setBateria(bateria);
        System.out.println(celular);
        celular.encenderCelular();
        
        System.out.println(celular.getUsuario().getNombre());
        System.out.println(usuario.getCelular().getModelo());
    }
    
}
