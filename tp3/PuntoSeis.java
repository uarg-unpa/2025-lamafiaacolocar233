

import java.util.Scanner;

public class PuntoSeis {
    public static void main(String[] args) {
        int[] pila = {5, 10, 15, 20, 25};
        int cima = 4;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese K (posición desde la cima): ");
        int k = sc.nextInt();

        if (k <= cima + 1) {
            int indice = cima - (k - 1);
            System.out.println("El elemento K-ésimo es: " + pila[indice]);
        } else {
            System.out.println("No hay suficientes elementos en la pila.");
        }

        sc.close();
    }
}
