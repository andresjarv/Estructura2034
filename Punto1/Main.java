
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        int cantidad = 0, opc;
        String nombreBuscar;
        System.out.println("ingrese el tamano de la matriz objeto: ");
        cantidad = leer.nextInt();

        Almacen[][] datoAlmacen = new Almacen[cantidad][cantidad];
        while (flag) {
            System.out.println(
                    "--Opcion a realizar--\n1.Llenar Matriz Objetual.\n2.Mostrar matriz de objetos.\n3.Buscar un dato por el nombre.\n4.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    datoAlmacen = almacen.llenarMatrizObjetual(cantidad);
                    break;
                case 2:
                    almacen.mostrarMatrizObjetual(datoAlmacen);
                    break;
                case 3:
                    System.out.println("Buscar un dato por el nombre: ");
                    nombreBuscar = leer.nextLine();
                    almacen.BuscarDato(nombreBuscar, datoAlmacen);
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("Opcion no es valida ");
                    break;
            }
        }

    }

}
