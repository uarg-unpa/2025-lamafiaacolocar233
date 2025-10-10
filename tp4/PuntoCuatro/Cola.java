
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
            System.out.println(" Error: la cola está llena.");
        }
    }

    
    public int borrar() {
        if (!estaVacia()) {
            int aux = elementos[frente];
            frente = (frente + 1) % MAX; 
            cantidad--;
            return aux;
        } else {
            System.out.println(" Error: la cola está vacía.");
            return -1;
        }
    }

    
    public int contar() {
        return cantidad;
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
}
