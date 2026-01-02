package tienda;
import java.util.ArrayList;
public class Pedido {
    public Cliente cliente;
    public ArrayList<Producto> productos = new ArrayList<>();
    public void addProducto(Producto p) {
        productos.add(p);
    }
    public double calcular() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);

            // REFACTORIZADO: Ahora el producto calcula su propio subtotal
            total = total + p.getSubtotal();

            if (p.getCantidad() > 10) {
                total -= 10;
            }
        }
        if (total > 100) {
            total = total - 10;
        }
        return total;
    }
}
