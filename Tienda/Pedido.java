public class Pedido {

	private int numeroPedido;
	private List<Producto> productos;

	/**
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto) {
		// TODO - implement Pedido.agregarProducto
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Pedido.toString
		throw new UnsupportedOperationException();
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	/**
	 * 
	 * @param numeroPedido
	 */
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	/**
	 * 
	 * @param productos
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}