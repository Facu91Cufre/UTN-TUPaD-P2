/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

public class Titular {
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte;

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
   public void setPasaporte(Pasaporte pasaporte){
       this.pasaporte = pasaporte;
       if(pasaporte != null && pasaporte.getTitular() != this){
           pasaporte.setTitular(this);
       }
   }
   
   public Pasaporte getPasaporte(){
       return pasaporte;
   }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
   
}
