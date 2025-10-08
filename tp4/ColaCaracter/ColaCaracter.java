public class ColaCaracter {
    private char[] elementos;   // Array de caracteres
    private int fin;            // Última posición ocupada
    private final int MAX = 10; // Tamaño máximo de la cola

    // Constructor
    public ColaCaracter() {
        elementos = new char[MAX];
        fin = 0;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return fin == 0;
    }

    // Verificar si está llena
    public boolean estaLlena() {
        return fin == MAX;
    }

    // Encolar (insertar) un carácter al final
    public void encolar(char c) {
        if (!estaLlena()) {
            elementos[fin] = c;
            fin++;
        } else {
            System.out.println(" Error: la cola está llena.");
        }
    }

    // Desencolar (borrar) el carácter más antiguo (posición 0)
    public char desencolar() {
        if (!estaVacia()) {
            char aux = elementos[0]; // guardamos el primer carácter
            for (int i = 0; i < fin - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            fin--; 

            return aux;
        } else {
            System.out.println(" Error: la cola está vacía.");
            return '\0'; 
        }
    }

  
    public char peek() {
        if (!estaVacia()) {
            
            return elementos[0];
        } else {
            System.out.println("La cola está vacía, no hay frente.");
            return '\0';
        }
    }

    
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola de comandos: ");
            for (int i = 0; i < fin; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
