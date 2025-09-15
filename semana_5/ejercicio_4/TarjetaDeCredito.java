/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaDeVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaDeVencimiento) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    public String getNumero(){
        return numero;
    }
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaDeVencimiento=" + fechaDeVencimiento + ", banco=" + banco + ", cliente" + cliente + '}';
    }

}
