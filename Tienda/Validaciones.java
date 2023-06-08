import java.util.Scanner;

public class Validaciones {
    public static double validaPrecio(Scanner scanner) {
        double precio = -1;

        while (precio < 0) {
            try {
                System.out.println("Ingrese el precio del producto:");
                precio = Double.parseDouble(scanner.nextLine());

                if (precio < 0) {
                    System.out.println("El precio no puede ser negativo. Por favor, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }

        return precio;
    }

    public static int validaNumeroPedido(Scanner scanner) {
        int numeroPedido = -1;

        while (numeroPedido <= 0) {
            try {
                System.out.println("Ingrese el número del pedido:");
                numeroPedido = Integer.parseInt(scanner.nextLine());

                if (numeroPedido <= 0) {
                    System.out.println("El número del pedido debe ser un número positivo. Por favor, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }

        return numeroPedido;
    }
}
