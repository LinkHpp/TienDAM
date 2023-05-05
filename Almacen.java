public class Almacen {

    // Atributos

    Articulo[] Articulos = new Articulo();
    final int maxArticulos;
    int indice;
    int cantidad;

    // Setters y Getters

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

    // Metodos

    public void añadirArticulos(){


    }

}
