public class PuntoCinco {
    public static void main(String[] args) {
        int[] pila = {10, 20, 30, 40};
        int cima = 3; // apunta al último
        if (cima >= 0) {
            System.out.println("Elemento en la cima: " + pila[cima]);
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}
