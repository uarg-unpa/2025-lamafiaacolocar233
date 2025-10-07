import java.util.Scanner;

public class PruebaCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE COLA ===");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Eliminar repetidos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número: ");
                    int num = sc.nextInt();
                    cola.insertar(num);
                    System.out.println("Elemento insertado: " + num);
                    break;

                case 2:
                    cola.mostrar();
                    break;

                case 3:
                    cola.eliminarRepetidos();
                    cola.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
