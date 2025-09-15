/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class Cliente {
    private String nombre;
    private String DNI;
    private TarjetaDeCredito tarjeta;
    
    public Cliente(String nombre, String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public TarjetaDeCredito getTarjeta(){
        return tarjeta;
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta){
        this.tarjeta = tarjeta;
        if(tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
}
