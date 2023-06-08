import java.util.ArrayList;

public class Vendedor {
	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Pedido> pedidos;

	public Vendedor(String nombre) {
		this.nombre = nombre;
		productos = new ArrayList<Producto>();
		pedidos = new ArrayList<Pedido>();
	}

	public void despacharPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void venderProducto(Producto producto) {
		productos.add(producto);
	}

	public String toString() {
		return "Nombre: " + nombre + ", Productos: " + productos + ", Pedidos: " + pedidos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
