package tienda;

/**
 * Clase principal que se utiliza para simular la creación de un cliente, productos y el cálculo de un pedido.
 */
public class Main {
    /**
     * Método principal que ejecuta la lógica de demostración de la aplicación.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNombre("Juan");
        c.setEmail("juan@email.com");
        Producto p1 = new Producto("Teclado", 20.5, 3);
        Producto p2 = new Producto("Raton", 10.0, 5);
        Pedido pedido = new Pedido();
        pedido.setCliente(c);
        pedido.addProducto(p1);
        pedido.addProducto(p2);
        System.out.println("Total pedido: " + pedido.calcular());
    }
}