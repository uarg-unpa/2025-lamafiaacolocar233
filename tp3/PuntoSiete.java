package tp3;

public class PuntoSiete {
    public static void main(String[] args) {
        int[] pila = {1, 2, 3, 4, 5};
        int cima = 4;

        int[] copia = new int[pila.length];
        int cimaCopia = cima;

        for (int i = 0; i <= cima; i++) {
            copia[i] = pila[i];
        }

        System.out.print("Pila original: ");
        for (int i = 0; i <= cima; i++) System.out.print(pila[i] + " ");

        System.out.print("\nPila copia: ");
        for (int i = 0; i <= cimaCopia; i++) System.out.print(copia[i] + " ");
    }
}
