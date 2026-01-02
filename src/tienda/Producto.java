package tienda;
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto(String n, double p, int c) {
        setNombre(n);
        setPrecio(p);
        setCantidad(c);
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
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Calcula el subtotal del producto basado en su precio y cantidad.
     * @return El resultado de multiplicar el precio por la cantidad.
     */
    public double getSubtotal() {
        return this.precio * this.cantidad;
    }
}