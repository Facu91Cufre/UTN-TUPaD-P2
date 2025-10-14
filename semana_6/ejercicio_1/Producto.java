/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

public class Producto {
    private String ID;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String ID, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    public void mostrarInfo(){
        System.out.println("ID: " + this.ID + 
                           "\nNombre: " + this.nombre + 
                           "\nPrecio: " + this.precio + 
                           "\nCantidad: " + this.cantidad);
        System.out.println("----------");
    }
     
    
}
