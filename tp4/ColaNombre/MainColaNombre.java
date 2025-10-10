package ColaNombre;

import java.util.Scanner;

public class MainColaNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombre cola = new ColaNombre();
        int opcion;

        do  {
            System.out.println("\n=== MENÚ DE COLA DE NOMBRES ===");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Mostrar nombre en el frente (peek)");
            System.out.println("4. Mostrar estado y contenido");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println(" La cola está llena.");
                    } else {
                        System.out.print("Ingrese un nombre: ");
                        String nombre = sc.nextLine();
                        cola.encolar(nombre);
                        System.out.println(" '" + nombre + "' encolado correctamente.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println(" La cola está vacía, no se puede desencolar.");
                    } else {
                        String eliminado = cola.desencolar();
                        System.out.println(" Se eliminó del frente: '" + eliminado + "'");
                    }
                    break;

                case 3:
                    if (!cola.estaVacia()) {
                        System.out.println(" Nombre en el frente: " + cola.peek());
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
