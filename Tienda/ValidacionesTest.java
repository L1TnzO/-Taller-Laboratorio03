import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {
    private InputStream standardIn;
    private ByteArrayInputStream testIn;

    @BeforeEach
    void setUp() {
        standardIn = System.in;
    }

    @AfterEach
    void tearDown() {
        System.setIn(standardIn);
    }

    @Test
    void validaPrecio_ValidInput_ReturnsValidPrice() {
        String input = "10.5\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        double precio = Validaciones.validaPrecio(scanner);
        assertEquals(10.5, precio);
    }

    @Test
    void validaPrecio_NegativeInput_DisplayErrorMessageAndRetry() {
        String input = "-5\n10.5\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        double precio = Validaciones.validaPrecio(scanner);
        assertEquals(10.5, precio);
    }

    @Test
    void validaPrecio_InvalidInput_DisplayErrorMessageAndRetry() {
        String input = "abc\n10.5\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        double precio = Validaciones.validaPrecio(scanner);
        assertEquals(10.5, precio);
    }

    @Test
    void validaPrecio_EmptyInput_DisplayErrorMessageAndRetry() {
        String input = "\n10.5\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        double precio = Validaciones.validaPrecio(scanner);
        assertEquals(10.5, precio);
    }

    @Test
    void validaNumeroPedido_ValidInput_ReturnsValidNumber() {
        String input = "100\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        int numeroPedido = Validaciones.validaNumeroPedido(scanner);
        assertEquals(100, numeroPedido);
    }

    @Test
    void validaNumeroPedido_NegativeInput_DisplayErrorMessageAndRetry() {
        String input = "-5\n100\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        int numeroPedido = Validaciones.validaNumeroPedido(scanner);
        assertEquals(100, numeroPedido);
    }

    @Test
    void validaNumeroPedido_InvalidInput_DisplayErrorMessageAndRetry() {
        String input = "abc\n100\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        int numeroPedido = Validaciones.validaNumeroPedido(scanner);
        assertEquals(100, numeroPedido);
    }

    @Test
    void validaNumeroPedido_EmptyInput_DisplayErrorMessageAndRetry() {
        String input = "\n100\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        int numeroPedido = Validaciones.validaNumeroPedido(scanner);
        assertEquals(100, numeroPedido);
    }

    @Test
    void validaNumeroPedido_NoInput_ThrowsNoSuchElementException() {
        String input = "";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        Scanner scanner = new Scanner(System.in);
        assertThrows(NoSuchElementException.class, () -> Validaciones.validaNumeroPedido(scanner));
    }
}
