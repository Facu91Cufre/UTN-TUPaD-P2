/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Codigo creado con exito: " + codigo);
    }
}
