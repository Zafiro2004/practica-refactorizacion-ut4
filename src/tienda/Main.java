package tienda;
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.nombre = "Juan";
        c.email = "juan@email.com";
        Producto p1 = new Producto("Teclado", 20.5, 3);
        Producto p2 = new Producto("Raton", 10.0, 5);
        Pedido pedido = new Pedido();
        pedido.cliente = c;
        pedido.addProducto(p1);
        pedido.addProducto(p2);
        System.out.println("Total pedido: " + pedido.calcular());
    }
}