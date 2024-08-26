import java.util.*;

public class Almacen{
    Scanner leer = new Scanner(System.in);
    String nombre;
    double precio;
    int cantidadProducto;

    public Almacen(){
        nombre = "";
        precio = 0;
        cantidadProducto = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidadProducto;
    }

    public void setCantidad(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Almacen[][] llenarMatrizObjetual(int cantidad){
        Almacen[][] datoAlmacen = new Almacen[cantidad][cantidad];//Con esta instruccion se declara la matriz        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                Almacen almacen = new Almacen();
                System.out.println("Ingrese nombre del producto: ");
                almacen.setNombre(leer.next());
                System.out.println("Ingrese el precio: ");
                almacen.setPrecio(leer.nextDouble());
                System.out.println("Ingrese la cantidad del producto: ");
                almacen.setCantidad(leer.nextInt());
                datoAlmacen[i][j]= almacen;
            }
            
        }
        return datoAlmacen;
    }

    public void mostrarMatrizObjetual(Almacen[][] datoAlmacen){
        for (int i = 0; i < datoAlmacen.length; i++) {
            for (int j = 0; j < datoAlmacen.length; j++) {
                System.out.print("[ "+ datoAlmacen[i][j].getNombre());
                System.out.print(" - "+ datoAlmacen[i][j].getPrecio());
                System.out.print(" - "+ datoAlmacen[i][j].getCantidad()+" ]");
            }
            System.out.println(" ");            
        }
    }

    public void BuscarDato(String buscarNombre, Almacen[][] datoAlmacen){
        boolean encontrado = false;
        for (int i = 0; i < datoAlmacen.length; i++) {
            for (int j = 0; j < datoAlmacen.length; j++) {
                if(datoAlmacen[i][j].getNombre().equals(buscarNombre)){
                    System.out.println("Valor encontrador en la posicion: ["+i+"]["+j+"]");
                    encontrado = true;
                    break;
                }
                
            }
            if (encontrado) break;
            
        }
        if (!encontrado){
            System.out.println("Producto no esta en la matriz.");
        }
    }

    public int InventarioTotal(Almacen[][] datoAlmacen){
        int contador = 0;
        for (int i = 0; i < datoAlmacen.length; i++) {
            for (int j = 0; j < datoAlmacen.length; j++) {
                if(datoAlmacen[i][j].getCantidad() != 0){
                    contador += datoAlmacen[i][j].getCantidad();
                }
            }
        }

        return contador;
    }

}