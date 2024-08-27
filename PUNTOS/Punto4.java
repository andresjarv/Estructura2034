package PUNTOS;
import java.util.*;

// 4)	Problema: Dada una matriz que representa un teatro, donde cada celda contiene un objeto Asiento 
// con atributos número, fila, precio. Implementa un algoritmo para ordenar los asientos dentro de cada fila según el precio en orden ascendente.

public class Punto4 {
    int numero;
    int fila;
    double precio;
    Scanner leer = new Scanner(System.in)
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Punto4[][] llenarTeatro(int cantidad){
        Punto4[][] matrizTeatro = new Punto4[cantidad][cantidad];
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                Punto4 teatro = new Punto4();
                System.out.println("Ingrese numero de asiento: ");
                teatro.setNumero(leer.nextInt());
                System.out.println("Ingrese la fila: ");
                teatro.setFila(leer.nextInt());
                System.out.println("Ingrese precio del asiento: ");
                teatro.setPrecio(leer.nextDouble());;
                matrizTeatro[i][j] = teatro;
            }
            
        }
        return matrizTeatro;
    }

    public Punto4[][] ordenarAscendente(matrizTeatro[][]){
        return matrizOrdenadaAs;
    }
    
}
