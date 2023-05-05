public class Pedido {
    
    // Atributos
    String nombre;
    double porcentajeDescuento;
    double subtotal;
    double preciofinal;

    int[] idArticulos;
    int[] CantidadArticulos;
    int maxArticulos;
    


    // Setters y Getters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getPreciofinal() {
        return preciofinal;
    }
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
    public int[] getIdArticulos() {
        return idArticulos;
    }
    public void setIdArticulos(int[] idArticulos) {
        this.idArticulos = idArticulos;
    }
    public int[] getCantidadArticulos() {
        return CantidadArticulos;
    }
    public void setCantidadArticulos(int[] cantidadArticulos) {
        CantidadArticulos = cantidadArticulos;
    }
    public int getMaxArticulos() {
        return maxArticulos;
    }
    public void setMaxArticulos(int maxArticulos) {
        this.maxArticulos = maxArticulos;
    }
    

    // Constructor

    public Pedido(String nombre, double porcentajeDescuento, double subtotal, double preciofinal, int[] idArticulos, int[] cantidadArticulos, int maxArticulos) {
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
        this.subtotal = subtotal;
        this.preciofinal = preciofinal;
        this.idArticulos = idArticulos;
        CantidadArticulos = cantidadArticulos;
        this.maxArticulos = maxArticulos;
    }

    // Metodos



    

}
