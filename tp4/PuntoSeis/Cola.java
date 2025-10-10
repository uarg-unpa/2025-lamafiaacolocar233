public class Cola {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;
    private int cantidad;

    public Cola() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    public void insertar(int x) {
        if (!estaLlena()) {
            elementos[fin] = x;
            fin = (fin + 1) % MAX;
            cantidad++;
        } else {
            System.out.println(" Cola llena.");
        }
    }

    public int borrar() {
        if (!estaVacia()) {
            int aux = elementos[frente];
            frente = (frente + 1) % MAX;
            cantidad--;
            return aux;
        } else {
            System.out.println(" Cola vacía.");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola: ");
            int i = frente;
            for (int c = 0; c < cantidad; c++) {
                System.out.print(elementos[i] + " ");
                i = (i + 1) % MAX;
            }
            System.out.println();
        }
    }

    public int contar() {
        return cantidad;
    }

    // 👉 Nuevo método pedido por el TP
    public boolean sonIdenticas(Cola otra) {
        if (this.contar() != otra.contar()) {
            return false; // distinto tamaño, ya no son iguales
        }

        boolean iguales = true;
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();

        // Comparar elemento por elemento
        while (!this.estaVacia() && !otra.estaVacia()) {
            int e1 = this.borrar();
            int e2 = otra.borrar();

            if (e1 != e2) {
                iguales = false;
            }

            aux1.insertar(e1);
            aux2.insertar(e2);
        }

      
        while (!aux1.estaVacia()) {
            this.insertar(aux1.borrar());
            otra.insertar(aux2.borrar());
        }

        return iguales;
    }

    public void eliminarRepetidos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarRepetidos'");
    }
}
