import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArbolInventario arbol = new ArbolInventario();

        int opcion;

        do {
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = entrada.nextLine();

                    arbol.insertar(id, nombre);
                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- INVENTARIO ORDENADO ---");
                    arbol.inorden();
                    break;

                case 3:
                    System.out.print("Ingrese el ID que desea buscar: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();

                    Producto productoEncontrado = arbol.buscar(idBuscar);

                    if (productoEncontrado != null) {
                        System.out.println(
                            "Producto encontrado: ID: "
                            + productoEncontrado.getId()
                            + " | Nombre: "
                            + productoEncontrado.getNombre()
                        );
                    } else {
                        System.out.println("El producto no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 0);

        entrada.close();
    }
}