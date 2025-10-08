
import java.util.Scanner;
public class PuntoOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toUpperCase();

        int n = frase.length();
        char[] pila = new char[n];
        int cima = -1;

        for (int i = 0; i < n/2; i++) {
            pila[++cima] = frase.charAt(i);
        }

        int inicio = (n % 2 == 0) ? n/2 : n/2 + 1;
        boolean esPal = true;
        for (int i = inicio; i < n; i++) {
            if (frase.charAt(i) != pila[cima--]) {
                esPal = false; break;
            }
        }

        System.out.println(esPal ? "Es palíndromo" : "No es palíndromo");
        sc.close();
    }
}
