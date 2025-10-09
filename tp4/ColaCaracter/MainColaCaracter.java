import java.util.Scanner;

public class MainColaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracter cola = new ColaCaracter();
        int opcion;
        char comando;

        do {
            System.out.println("\n=== MENÚ DE COLA DE CARACTERES ===");
            System.out.println("1. Encolar comando");
            System.out.println("2. Desencolar comando");
            System.out.println("3. Mostrar frente (peek)");
            System.out.println("4. Mostrar cola completa");
            System.out.println("5. Mostrar estado (vacía / llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: 
                    if (cola.estaLlena()) {
                        System.out.println("Error: la cola está llena.");
                    } else {
                        System.out.print("Ingrese un comando (carácter): ");
                        comando = sc.next().charAt(0);
                        cola.encolar(comando);
                        System.out.println("Comando '" + comando + "' agregado a la cola.");
                    }
                    break;

                case 2: 
                    if (cola.estaVacia()) {
                        System.out.println("Error: la cola está vacía.");
                    } else {
                        char eliminado = cola.desencolar();
                        System.out.println("Comando '" + eliminado + "' eliminado del frente de la cola.");
                    }
                    break;

                case 3: 
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía, no hay frente.");
                    } else {
                        System.out.println("El comando en el frente es: " + cola.peek());
                    }
                    break;

                case 4: 
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía, nada que mostrar.");
                    } else {
                        System.out.println("Contenido de la cola:");
                        cola.mostrar();
                    }
                    break;

                case 5: 
                    System.out.println("¿Vacía? " + cola.estaVacia() + " | ¿Llena? " + cola.estaLlena());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
