import java.util.InputMismatchException;
import java.util.Scanner;

public class TienDAM {

    public static Almacen warehouse = new Almacen(50, 0, 0);

    public static void main(String args[]) {

        // Variables auxiliares
        int opcion;


        // Menu principal

        do {

            System.out.println("Bienvenido a TienDAM, por favor introduzca un numero");
            System.out.println("1. ALMACEN\n" + "2. PEDIDO\n" + "3. SALIR");

            opcion = scanInt();

            switch (opcion) {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Gracias por usar TienDAM. Hasta la proxima");
                    break;
            }
            System.out.println();

        } while (opcion != 3);

    }

    public static void menuAlmacen() {

        // Variables auxiliares
        int opcion;
        int indice;
        int cantidad;
        String nombre;

        // Menu Almacen Principal

        do {
            System.out.println("---ALMACEN---");
            System.out.println("1. Ver almacen\n"
                    + "2. Buscar\n"
                    + "3. Añadir Articulos\n"
                    + "4. Quitar Articulos\n"
                    + "5. Recibir Articulos\n"
                    + "6. Devolver Articulos\n"
                    + "7. Salir\n");

            opcion = scanInt();

            switch (opcion) {
                case 1:
                    // Ver Almacen

                    Almacen.verArticulos();
                    break;

                case 2:
                    // Buscar Almacen

                    System.out.println("Por favor, introduzca el nombre del producto");
                    nombre = scanString();
                    Almacen.buscarArticulo(nombre);
                    break;

                case 3:
                    // Añadir Articulos Almacen

                    System.out.println("Por favor, introduzca el nombre del producto");
                    nombre = scanString();

                    System.out.println("Por favor, introduzca el precio del producto");
                    double precio = scanDouble();

                    System.out.println("Por favor, introduzca el IVA del producto");
                    int iva = scanInt();

                    System.out.println("Por favor, introduzca la cantidad del producto");
                    cantidad = scanInt();
                    Almacen.añadirArticulos(nombre, precio, iva, cantidad);
                    break;
                case 4:
                    // Quitar Articulos Almacen

                    System.out.println("Por favor, introduzca el ID del producto que quiera eliminar");
                    indice = scanInt();
                    Almacen.quitarArticulos(indice);

                    break;

                case 5:
                    // Recibir Almacen

                    System.out.println("Introduce el producto que quieres aumentar");
                    indice = scanInt();
                    System.out.println("Introduce cuanto quieres aumentar");
                    int cant = scanInt();

                    Almacen.recibirArticulo(indice, cant);
                    break;

                case 6:
                    // Devolver Articulos

                    System.out.println("Introduce el producto que quieres aumentar");
                    indice = scanInt();
                    System.out.println("Introduce cuanto quieres aumentar");
                    cant = scanInt();

                    Almacen.devolverArticulo(indice, cant);
                    break;

                case 7:
                    // Salir
                    break;
            }
        } while (opcion != 7);
    }


    // Metodo para pedir String

    public static String scanString() {
        Scanner in = new Scanner(System.in);
        System.out.print(">> ");
        String text = in.nextLine();
        return text;
    }

    // Metodo para pedir Integer

    public static int scanInt() {
        Scanner in = new Scanner(System.in);
        System.out.print(">> ");
        try {
            int number = in.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Introduce un valor adequado");
            scanInt();
            return 0;
        }

    }

    // Metodo para pedir Double

    public static double scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print(">> ");
        try {
            double number = in.nextDouble();
            return number;
        } catch (Exception e) {
            System.out.println("ERROR: Introduce un valor adequado");
            scanDouble();
            return 0;
        }
    }

}