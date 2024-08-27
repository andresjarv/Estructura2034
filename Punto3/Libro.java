import java.util.*;

public class Libro{

    Scanner leer = new Scanner(System.in);
    String titulo;
    String autor;
    Double precio;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public Libro[][] llenarLibros(int cantidad){
        Libro[][] datoLibro = new Libro[cantidad][cantidad];//Con esta instruccion se declara la matriz        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                Libro libro = new Libro();
                System.out.println("Ingrese titulo del libro: ");
                libro.setTitulo(leer.next());
                System.out.println("Ingrese el autor: ");
                libro.setAutor(leer.next());
                System.out.println("Ingrese el precio: ");
                libro.setPrecio(leer.nextDouble());
                datoLibro[i][j]= libro;
            }
            
        }
        return datoLibro;
    }

    public void mostrarLibros(Libro[][] datoLibro){
        for (int i = 0; i < datoLibro.length; i++) {
            for (int j = 0; j < datoLibro.length; j++) {
                System.out.print("[ "+ datoLibro[i][j].getTitulo());
                System.out.print(" - "+ datoLibro[i][j].getAutor());
                System.out.print(" - "+ datoLibro[i][j].getPrecio()+" ]");
            }
            System.out.println(" ");            
        }
    }

    public String LibroMasCaro(Libro[][] datoLibro){
        double mayor = datoLibro[0][0].getPrecio();
        String msj;
        for (int i = 0; i < datoLibro.length; i++) {
            for (int j = 0; j < datoLibro.length; j++) {
                if(datoLibro[i][j].getPrecio() > mayor){
                    mayor = datoLibro[i][j].getPrecio();
                    msj = "El dato mayor es: "+datoLibro[i][j].precio+"De la posicion: "+datoLibro[i][j].titulo+ 
                    datoLibro[i][j].autor;
                    break;
                }
                
            }
        }
        
        return msj;
    }

}