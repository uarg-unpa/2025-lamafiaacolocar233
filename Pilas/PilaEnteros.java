package Pilas;
public class PilaEnteros {
    private int[] elementos; 
    private int cima;        
    private final int MAX = 10; 

 
    public PilaEnteros() {
        elementos = new int[MAX]; 
        cima = -1; 
    }


    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    
    public void meter(int elem) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = elem;
        }
    }

    public int sacar() {
        if (!estaVacia()) {
            int elem = elementos[cima];
            cima--;
            return elem;
        }
        return -1; 
    }
}
