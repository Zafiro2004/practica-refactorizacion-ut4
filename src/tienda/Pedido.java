package tienda;
import java.util.ArrayList;
/**
 * Gestiona el conjunto de productos seleccionados por un cliente
 * y realiza el cálculo de los importes totales y descuentos aplicables.
 */
public class Pedido {
    public static final double DESCUENTO_GENERAL = 0.05;
    public static final int UMBRAL_PEDIDO_GRANDE = 100;
    public static final int DESCUENTO_CANTIDAD = 10;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    /**
     * Añade un nuevo producto a la lista del pedido.
     * @param p El objeto Producto que se desea añadir.
     */
    public void addProducto(Producto p) {
        getProductos().add(p);
    }
    /**
     * Calcula el total final del pedido aplicando las reglas de negocio:
     * 1. Suma de importes individuales.
     * 2. Descuento de 10€ por cada producto con cantidad > 10.
     * 3. Descuento general del 5% sobre el subtotal.
     * 4. Descuento adicional de 10€ si el total supera los 100€.
     *  @return El importe total neto a pagar por el cliente.
     */
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
    /**
     * Aplica los descuentos globales del pedido (5% general y volumen).
     * Patrón aplicado: Extraer Método para mejorar la semántica y legibilidad.
     * @param total El importe acumulado antes de descuentos globales.
     * @return El importe final tras aplicar las deducciones.
     */
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
