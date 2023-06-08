public class Vendedor {

	private String nombre;
	private List<Producto> productos;
	private List<Pedido> pedidos;

	/**
	 * 
	 * @param pedido
	 */
	public void despacharPedido(Pedido pedido) {
		// TODO - implement Vendedor.despacharPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public void venderProducto(Producto producto) {
		// TODO - implement Vendedor.venderProducto
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Vendedor.toString
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	/**
	 * 
	 * @param pedidos
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}