/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String imei, String marca, String modelo){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if(this.usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
    }
    
    public void encenderCelular(){
        if(this.bateria != null){
            System.out.println("Encendiendo el celular...");
        }else{
            System.out.println("El celular no tiene batería, inserte una para encenderlo.");
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }
      
}
