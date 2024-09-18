/*5)	Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. 
Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. 
Los productos que no son idénticos los debe agregar en la matriz resultante*/

package PUNTOS.Punto5;

import java.util.Scanner;

public class Punto5 {

    Scanner leer = new Scanner(System.in);

    public Producto[][] llenarLibros(int cantidad){
        Producto[][] datoProducto = new Producto[cantidad][cantidad];//Con esta instruccion se declara la matriz        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                Producto producto = new Producto();
                System.out.println("Nombre del producto: ");
                producto.setNombre(leer.next());
                System.out.println("Precio: ");
                producto.setPrecio(leer.nextDouble());
                System.out.println("Stock: ");
                libro.set(leer.nextInt());
                datoLibro[i][j]= libro;
            }
            
        }
        return datoLibro;
    }
    
    
    
}
