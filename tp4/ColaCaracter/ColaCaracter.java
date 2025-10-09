public class ColaCaracter {
    private char[] elementos;  // Arreglo para almacenar los elementos
    private int fin;           // Índice del final de la cola
    private final int MAX = 10; // Capacidad máxima de la cola

    // Constructor
    public ColaCaracter() {
        elementos = new char[MAX];
        fin = 0;
    }

    public boolean estaVacia() {
        return fin == 0;
    }

  
    public boolean estaLlena() {
        return fin == MAX;
    }

  
    public void encolar(char c) {
        // No hay validaciones ni mensajes acá
        elementos[fin] = c;
        fin++;
    }

  
    public char desencolar() {
        char primero = elementos[0];
      
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return primero;
    }

    
    public char peek() {
      
        if (!estaVacia()) {
            return elementos[0];
        } else {
            return '\0'; 
        }
    }

    
    public void mostrar() {
        ColaCaracter copia = new ColaCaracter();
    
        for (int i = 0; i < fin; i++) {
            copia.encolar(elementos[i]);
        }

        while (!copia.estaVacia()) {
            System.out.print(copia.desencolar() + " ");
        }
        System.out.println();
    }
}
