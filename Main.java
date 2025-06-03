import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Producto> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    private static void mostrarMenu() {
        System.out.println("=== Sistema de Stock ===");
        System.out.println("1. Registrar producto");
        System.out.println("2. Ver productos");
        System.out.println("3. Salir");
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }

    private static void registrarProducto() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        int id = leerEntero("ID: ");
        int cantidad = leerEntero("Cantidad inicial: ");
        int minimo = leerEntero("Cantidad mínima: ");

        // En este ejemplo simple no solicitamos la categoría
        Producto p = new Producto(nombre, id, null, cantidad, minimo);
        inventario.add(p);
        System.out.println("Producto registrado\n");
    }

    private static void listarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados\n");
            return;
        }
        for (Producto p : inventario) {
            System.out.println(p.getId() + " - " + p.getNombre() + " (" + p.getCantidadAcumulada() + ")");
        }
        System.out.println();
    }
}
