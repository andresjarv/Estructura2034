/*8)	En una empresa agrícola existen diversos productos cada uno con su nombre, peso, precio por unidad y categoría, 
los almacenistas no organizaron los productos por categoría por lo cual necesitan saber cuántos productos hay y mostrar un informe agrupado por categoría */

package Punto8Parcial;
import java.util.*;

public class Punto8 {

    Scanner leer = new Scanner(System.in);

    public Agricola[][] llenarMatriz(int cantidad){
        Agricola[][] datosAgricola = new Agricola[cantidad][cantidad];
        for (int i = 0; i < cantidad; i++) {
            for(int j=0; i < cantidad; i++){
                Agricola agricola = new Agricola();
                System.out.println("Ingrese nombre del producto: ");
                agricola.setNombre(leer.next());
                System.out.println("Peso: ");
                agricola.setPeso(leer.nextDouble());
                System.out.println("Precio: ");
                agricola.setPrecio(leer.nextDouble());
                System.out.println("Unidad: ");
                agricola.setUnidad(leer.nextInt());
                System.out.println("Categoria: ");
                agricola.setCategoria(leer.next());
            }
            
        }
        return datosAgricola;       
    }

    public Agricola[][] mostrarPorCategoria(Agricola[][] agr,int cantidad){
        Agricola[][] agrAux = new Agricola[cantidad][cantidad];
        for (int i = 0; i < agr.length; i++) {
            for (int j = 0; j < agr.length; j++) {
                if(agr[i][j].getCategoria().equals(agr[i][j].getCategoria()+1)){
                    agrAux[i][j].setCategoria() = agr[i][j].getCategoria();
                    System.out.print("[ "+ agr[i][j].getNombre());
                    System.out.print(" - "+ agr[i][j].getPrecio());
                    System.out.print(" - "+ agr[i][j].getPeso()+" ]");
                }else{
                    break;
                }
                
            }
            System.out.println(" ");            
        }
        return null;
    }
    
    
}
