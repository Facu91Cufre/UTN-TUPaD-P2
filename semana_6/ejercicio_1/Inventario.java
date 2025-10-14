/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();
    
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public List<Producto> listarProductos(){
        return productos;
    }
    
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto productoEncontrado = null;
        while(i < productos.size() && !productos.get(i).getID().equalsIgnoreCase(id)){
            i++;
        }
        if(i < productos.size()){
            productoEncontrado = productos.get(i);
        }
        return productoEncontrado;
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        List<Producto> listaFiltrada = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria){
                listaFiltrada.add(producto);
            }
        }
        return listaFiltrada;
    }
    
    public void eliminarProducto(String id){
        Producto productoBuscado = buscarProductoPorId(id);
        if(productoBuscado != null){
            productos.remove(productoBuscado);
            System.out.println("Producto: " + id + " fue eliminado con éxito.");
        } else{
            System.out.println("No se encontró el producto con id: " + id + ".");
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto productoAActualizar = buscarProductoPorId(id);
        if(productoAActualizar != null){
            productoAActualizar.setCantidad(nuevaCantidad);
        }
    }
    
    public int obtenerTotalStock(){
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock(){
        Producto productoMaxStock = null;
        int max = -1;
        for (Producto producto : productos) {
            if(producto.getCantidad() > max){
                max = producto.getCantidad();
                productoMaxStock = producto;
            }
        }
        return productoMaxStock;
    }
    
    public List<Producto> listarProductosPorPrecio(double min, double max){
        List<Producto> listaFiltrada = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getPrecio() >= min && producto.getPrecio() <= max){
                listaFiltrada.add(producto);
            }
        }
        return listaFiltrada;
    }
}
