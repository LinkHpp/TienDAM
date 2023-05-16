import java.util.ArrayList;
import java.lang.String;

public class Almacen {

    ////////////////////// Atributos////////////////////////

    static ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
    final int maxArticulos;
    int indice;
    int cantidad;

    ///////////////////// Setters y Getters/////////////////

    public int getMaxArticulos() {
        return maxArticulos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Constructor

    public Almacen(int maxArticulos, int indice, int cantidad) {

        this.maxArticulos = maxArticulos;
        this.indice = indice;
        this.cantidad = cantidad;
    }

    //////////////////// Metodos ///////////////////


    // Metodo para ver articulos

    public static void verArticulos() {

        if (listaArticulos.isEmpty()) {
            System.out.println("No hay nada en el almacen");
        } else {
            for (int i = 0; i < listaArticulos.size(); i++) {
                System.out.println("ID: " + i);
                System.out.println(listaArticulos.get(i) + "\n");
            }
        }

    }

    // Metodo para añadir articulos al almacen

    public static void añadirArticulos(String nombre, double precio, int iva, int cantidad) {

        listaArticulos.add(new Articulo(nombre, precio, iva, cantidad));
    }

    // Metodo para quitar articulos al almacen

    public static void quitarArticulos(int indice) {

        listaArticulos.remove(indice);
    }

    // Metodo para aumentar la cantidad de un producto

    public static void recibirArticulo(int indice, int cant) {

        Articulo p1 = listaArticulos.get(indice);

        p1.aumentarCantidad(cant);

    }

    // Metodo para disminuir la cantidad de un producto

    public static void devolverArticulo(int indice, int cant) {

        Articulo p1 = listaArticulos.get(indice);

        p1.aumentarCantidad(cant);

    }

    // Metodo para buscar un producto y mostrar su informacion
    
    public static void buscarArticulo(String name) {

        for (int i = 0; i < listaArticulos.size(); i++) {

            Articulo art = listaArticulos.get(i);
            String nameArt = art.getNombre();

            if (nameArt.equals(name)) {
                System.out.println(listaArticulos.get(i) + "\n");

            }

        }

    }

}
