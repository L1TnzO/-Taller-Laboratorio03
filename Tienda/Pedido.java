import java.util.ArrayList;

public class Pedido {
	private int numeroPedido;
	private ArrayList<Producto> productos;

	public Pedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
		productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public String toString() {
		return "Número de Pedido: " + numeroPedido + ", Productos: " + productos;
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
}