package PuntoTres;

// Cola.java
public class Cola {
    private int[] elementos;  
    private int fin;           
    private final int MAX = 10; 

    // Constructor
    public Cola() {
        elementos = new int[MAX];
        fin = 0; // empieza vacía
    }


    public boolean estaVacia() {
        return fin == 0;
    }

  
    public boolean estaLlena() {
        return fin == MAX;
    }

    public void insertar(int x) {
        if (!estaLlena()) {
            elementos[fin] = x;
            fin++;
        } else {
            System.out.println(" Error: la cola está llena.");
        }
    }

    
    public int borrar() {
        if (!estaVacia()) {
            int aux = elementos[0]; 
          
            for (int i = 0; i < fin - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            fin--; 
            return aux;
        } else {
            System.out.println(" Error: la cola está vacía.");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Cola: ");
            for (int i = 0; i < fin; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

