
import java.util.*;

public class MenuLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in);     
        String msg = "";   
        int cantidad = 0;
        //String nombreBuscar;
        System.out.println("ingrese el tamaño de los datos a almacenar: ");
        cantidad = leer.nextInt();

        Libro[][] datoLibro = new Libro[cantidad][cantidad];

        datoLibro = libro.llenarLibros(cantidad);
        libro.mostrarLibros(datoLibro);
        msg=libro.LibroMasCaro(datoLibro);
        System.out.println(msg);

    }

}
