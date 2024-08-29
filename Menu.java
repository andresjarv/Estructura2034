
import java.util.*;

import PUNTOS.Punto4;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad=0;
        System.out.println("ingrese el tamano de la matriz objeto: ");
        cantidad = leer.nextInt();

        //Datos para probar
        Punto4 teatro = new Punto4();
        Punto4[][] teatroMatriz = new Punto4[cantidad][cantidad];

        teatroMatriz = teatro.llenarTeatro(cantidad);

        for (int i = 0; i < teatroMatriz.length; i++) {
            for (int j = 0; j < teatroMatriz.length; j++) {
                System.out.print("[ "+ teatroMatriz[i][j].getFila());
                System.out.print(" - "+ teatroMatriz[i][j].getNumero());
                System.out.print(" - "+ teatroMatriz[i][j].getPrecio()+" ]");
            }
        }

        matriz.sort(teatroMatriz.getPrecio);

        for (int i = 0; i < teatroMatriz.length; i++) {
            for (int j = 0; j < teatroMatriz.length; j++) {
                System.out.println("MATRIZ ORDENADA POR PRECIO");
                System.out.print("[ "+ teatroMatriz[i][j].getFila());
                System.out.print(" - "+ teatroMatriz[i][j].getNumero());
                System.out.print(" - "+ teatroMatriz[i][j].getPrecio()+" ]");
            }
        }
    }
    
}
