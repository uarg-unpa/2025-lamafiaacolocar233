import java.util.Scanner;

public class PruebaCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int opcion;

         {
            System.out.println("\n=== MENÚ DE COLA (Frente y Final Movibles) ===");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Contar elementos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.print("Ingrese número: ");
                        int num = sc.nextInt();
                        cola.insertar(num);
                        System.out.println("Elemento " + num + " insertado.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        int borrado = cola.borrar();
                        System.out.println("Elemento eliminado: " + borrado);
                    }
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 4:
                    System.out.println("La cola contiene " + cola.contar() + " elemento(s).");
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
