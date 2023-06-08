public class Principal {
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Juan");
		Menu menu = new Menu(vendedor);
		menu.mostrarMenu();
	}
}