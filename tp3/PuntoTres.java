package tp3;

import java.util.Scanner;

    public class PuntoTres{
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        char[] pila = new char[palabra.length()];
        int cima = -1;

        // apilar
        for (char c : palabra.toCharArray()) {
            pila[++cima] = c;
        }

        // desapilar e imprimir
        System.out.print("Palabra invertida: ");
        while (cima >= 0) {
            System.out.print(pila[cima--]);
        }

        sc.close();
    }
}
    