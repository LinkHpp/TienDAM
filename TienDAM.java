import java.util.Scanner;

public class TienDAM {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Almacen warehouse = new Almacen(50, 0, 0);
        int opcion;

        
        do {

            System.out.println("Bienvenido a TienDAM, por favor introduzca un numero");
            System.out.println("1. ALMACEN\n" + "2. PEDIDO\n" + "3. SALIR");
            System.out.print(">> ");
            
            opcion = in.nextInt();
    
            switch (opcion) {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Gracias por usar TienDAM. Hasta la proxima");
                    break;
                default:
                errorMessage();
                    break;
            }
            System.out.println();
            
        } while (opcion != 3);


    }

    public static void errorMessage(){
        System.out.println("ERROR, introduzca un valor correcto");
    }

    public static void menuAlmacen(){
        Scanner in = new Scanner(System.in);
        int opcion;

        System.out.println("---ALMACEN---");
        System.out.println("1. Ver almacen\n"
                        +  "2. Buscar\n"
                        +  "3. Añadir Articulos\n"
                        +  "4. Recibir Articulos\n"
                        +  "5. Devolver Articulos\n"
                        +  "6. Salir\n");

        opcion = in.nextInt();
        
        switch (opcion) {
            case 1:
                // Ver Almacen
                break;
            case 2: 
                // Buscar Almacen
                break;
            case 3:
                // Añadir Articulos Almacen
                break;
            case 4:
                // Recibir Almacen
                break;
            case 5:
                // Devolver Articulos
                break;
            case 6:
                // Salir
                break;
            default:
                errorMessage();
                break;
        }

        

    }


}