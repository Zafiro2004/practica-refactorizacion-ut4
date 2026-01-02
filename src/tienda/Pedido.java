package tienda;
import java.util.ArrayList;
public class Pedido {
    public static final double DESCUENTO_GENERAL = 0.05;
    public static final int UMBRAL_PEDIDO_GRANDE = 100;
    public static final int DESCUENTO_CANTIDAD = 10;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    public void addProducto(Producto p) {
        getProductos().add(p);
    }
    public double calcular() {
        double total = 0;
        for (int i = 0; i < getProductos().size(); i++) {
            Producto p = getProductos().get(i);
            total = total + p.getSubtotal();
            if (p.getCantidad() > 10) {
                total = total - 10;
            }
        }
        return aplicarDescuentosFinales(total);
    }

    private static double aplicarDescuentosFinales(double total) {
        total = total - (total * DESCUENTO_GENERAL);
        if (total > UMBRAL_PEDIDO_GRANDE) {
            total = total - DESCUENTO_CANTIDAD;
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
