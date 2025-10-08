package ColaNombre;
 public class ColaNombre {
    private String[] elementos;  // Array circular para nombres
    private int frente;          // Índice del primer elemento
    private int fin;             // Índice del último elemento
    private final int MAX = 10;  // Tamaño máximo de la cola

    
    public ColaNombre() {
        elementos = new String[MAX];
        frente = -1;
        fin = -1;
    }

    
    public boolean estaVacia() {
        return frente == -1;
    }

   
    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(String nombre) {
        if (estaLlena()) {
            System.out.println(" Error: la cola está llena.");
            return;
        }

        // Si la cola estaba vacía, el frente se inicializa en 0
        if (estaVacia()) {
            frente = 0;
        }

        // Avanza el fin de forma circular
        fin = (fin + 1) % MAX;
        elementos[fin] = nombre;
    }

    // Desencolar un nombre (eliminar el más antiguo)
    public String desencolar() {
        if (estaVacia()) {
            System.out.println(" Error: la cola está vacía.");
            return null;
        }

        String aux = elementos[frente];

        // Si solo había un elemento, se resetea la cola
        if (frente == fin) {
            frente = -1;
            fin = -1;
        } else {
            // Avanza el frente de forma circular
            frente = (frente + 1) % MAX;
        }

        return aux;
    }

    // Mostrar el nombre del frente sin eliminarlo 
    public String peek() {
        if (estaVacia()) {
            System.out.println(" La cola está vacía.");
            return null;
        }
        return elementos[frente];
    }

    // Mostrar todos los elementos de la cola circular
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.print("Cola de nombres: ");
        int i = frente;
        while (true) {
            System.out.print(elementos[i] + " ");
            if (i == fin) break;
            i = (i + 1) % MAX; 
        }
        System.out.println();
    }
}
