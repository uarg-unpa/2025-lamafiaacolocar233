public class ColaCircular {
    private int [] elementos;
    private int frente;
    private int fin;
    private int cantidad;
    private final int MAX = 5;

    public ColaCircular() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
        cantidad = 0;

    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena(){
        return cantidad == 0;
    }

     public void encolar(int elem) {
        if (!estaLlena()) {
            elementos[fin] = elem;
            fin = (fin + 1) % MAX;
            cantidad++;
        }
    }

    public int desencolar() {
        if (!estaVacia()) {
            int elem = elementos[frente];
            frente = (frente + 1) % MAX;
            cantidad--;
            return elem;
        }
        return -1;
    }

    public void mostrar() {
        if(estaVacia()) {
            System.out.println(" La cola esta vacia ");

        } else {
            System.out.print(" COLA: ");
            for ( int i = 0; i < cantidad; i++) {
                int indice = (frente +i) & MAX;
                System.out.print(elementos[indice] + " ");

            }

            System.out.println();
        }
    }


}
