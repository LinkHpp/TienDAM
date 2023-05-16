public class Articulo {

    //////////////// Atributos/////////////////

    final String nombre;
    double precio;
    final double iva;
    int cantidad;

    ///////////// Setters y Getters/////////////

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /////////////// Constructor//////////////

    public Articulo(String nombre, double precio, double iva, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    //////////////// Metodos////////////////

    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Precio: " + this.precio + " \n" + "IVA: " + this.iva + " \n"
                + "Cantidad: " + this.cantidad;
    }

    public void aumentarCantidad(int cant) {

        int cap = getCantidad() + cant;
        setCantidad(cap);

    }

    public void disminuirCantidad(int cant) {

        int cap = getCantidad() - cant;
        setCantidad(cap);

    }

}
