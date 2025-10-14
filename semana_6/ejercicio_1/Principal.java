/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        Producto p1 = new Producto("P001", "Televisor LED 4k", 200999.99, 12, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Buzo de Algodón", 70500.50, 35, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P003", "Juego de Sábanas", 12700.00, 20, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("P004", "Paquete de Café(500g)", 2400.00, 150, CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("P005", "Teclado Mecánico", 2999.99, 8, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        List<Producto> inventarioActual = inventario.listarProductos();
        imprimirListaPorConsola(inventarioActual);
        
        Producto pBuscado = inventario.buscarProductoPorId("P004");
        if(pBuscado != null){
            System.out.println("Producto encontrado: ");
            pBuscado.mostrarInfo();
        } else{
            System.out.println("No se encontró el producto con ese id.");
        }
        
        inventario.eliminarProducto("P003");
        
        inventario.actualizarStock("P004", 190);
        
        int totalStock = inventario.obtenerTotalStock();
        System.out.println(totalStock);
        
        Producto maxProducto = inventario.obtenerProductoConMayorStock();
        if(maxProducto != null){
            maxProducto.mostrarInfo();
        }
        
        List<Producto> listaFiltrada = inventario.listarProductosPorPrecio(1000, 3000);
        imprimirListaPorConsola(listaFiltrada);
        
        
        imprimirListaPorConsola(inventario);
        
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("Categoria: " + categoria.name() + "\nDescripcion: " + categoria.getDescripcion());
            System.out.println("----------");
        }
    }
    
    private static void imprimirListaPorConsola(Inventario inventario){
        List<Producto> lista = inventario.listarProductos();
        for (Producto producto : lista) {
            producto.mostrarInfo();
        }
    }
    
    private static void imprimirListaPorConsola(List<Producto> lista){
        for(Producto producto : lista){
            producto.mostrarInfo();
        }
    }
}
