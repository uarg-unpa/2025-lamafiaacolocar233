
public class Televisor {
    private String marca;
    private int pulgadas;
    private int volumen;
    private int canal;

    
    public Televisor(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.volumen = 10; 
        this.canal = 1;    
    }

    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }
    }

    public void cambiarCanal(int nuevoCanal) {
        if (nuevoCanal > 0 && nuevoCanal <= 999) {
            canal = nuevoCanal;
        }
    }

    public String mostrarInfo() {
        return "Marca: " + marca +
               " | Pulgadas: " + pulgadas +
               " | Canal: " + canal +
               " | Volumen: " + volumen;
    }
}
