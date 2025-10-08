import java.util.Scanner;

public class MainColaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracter cola = new ColaCaracter();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE COLA DE COMANDOS ===");
            System.out.println("1. Encolar comando (char)");
            System.out.println("2. Desencolar comando más antiguo");
            System.out.println("3. Mostrar comando en el frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println(" La cola está llena.");
                    } else {
                        System.out.print("Ingrese un carácter: ");
                        char comando = sc.next().charAt(0);
                        cola.encolar(comando);
                        System.out.println("Comando '" + comando + "' encolado correctamente.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println(" La cola está vacía, no se puede desencolar.");
                    } else {
                        char eliminado = cola.desencolar();
                        System.out.println("Comando '" + eliminado + "' eliminado del frente.");
                    }
                    break;

                case 3:
                    if (!cola.estaVacia()) {
                        char frente = cola.peek();
                        System.out.println("Comando en el frente: '" + frente + "'");
                    } else {
                        System.out.println(" La cola está vacía.");
                    }
                    break;

                case 4:
                    System.out.println("¿Vacía? " + cola.estaVacia() + " | ¿Llena? " + cola.estaLlena());
                    cola.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
