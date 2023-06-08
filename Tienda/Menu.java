import java.util.Scanner;

public class Menu {
	private Vendedor vendedor;
	private Scanner scanner;

	public Menu(Vendedor vendedor) {
		this.vendedor = vendedor;
		this.scanner = new Scanner(System.in);
	}

	public void mostrarMenu() {
		boolean seguir = true;
		while (seguir) {
			System.out.println("1. Mostrar datos del vendedor");
			System.out.println("2. Editar datos del vendedor");
			System.out.println("3. Añadir un producto al vendedor");
			System.out.println("4. Añadir un pedido al vendedor");
			System.out.println("5. Salir");
			String opcion = scanner.nextLine();

			switch (opcion) {
				case "1":
					mostrarDatos();
					break;
				case "2":
					editarDatos();
					break;
				case "3":
					añadirProducto();
					break;
				case "4":
					añadirPedido();
					break;
				case "5":
					System.out.println("¿Está seguro de que desea salir? Y/N");
					String confirmacion = scanner.nextLine();
					if (confirmacion.equalsIgnoreCase("Y")) {
						salir();
						seguir = false;
					}
					break;
				default:
					System.out.println("Opción inválida. Intente de nuevo.");
			}
		}
	}

	public void mostrarDatos() {
		System.out.println(vendedor.toString());
	}

	public void editarDatos() {
		System.out.println("Ingrese el nuevo nombre del vendedor:");
		String nuevoNombre = scanner.nextLine();
		vendedor.setNombre(nuevoNombre);
	}

	public void añadirProducto() {
		System.out.println("Ingrese el nombre del producto:");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el precio del producto:");
		double precio = scanner.nextDouble();
		scanner.nextLine(); // consume el newline
		Producto producto = new Producto(nombre, precio);
		vendedor.venderProducto(producto);
	}

	public void añadirPedido() {
		System.out.println("Ingrese el número del pedido:");
		int numeroPedido = scanner.nextInt();
		scanner.nextLine(); // consume the newline
		Pedido pedido = new Pedido(numeroPedido);
		vendedor.despacharPedido(pedido);
	}

	public void salir() {
		System.out.println("Saliendo del programa.");
		System.exit(0);
	}
}
