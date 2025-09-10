package tp2;

public class Televisor {
    private String marca;
    private int pulgadas;
    private int canal;
    private int volumen;
    private boolean encendido;

   
    public Televisor(String marca, int pulgadas, int canal, int volumen, boolean encendido) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.canal = canal;
        this.volumen = volumen;
        this.encendido = encendido;
    }

  
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getPulgadas() { return pulgadas; }
    public void setPulgadas(int pulgadas) { this.pulgadas = pulgadas; }

    public int getCanal() { return canal; }
    public void setCanal(int canal) { this.canal = canal; }

    public int getVolumen() { return volumen; }
    public void setVolumen(int volumen) { this.volumen = volumen; }

    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }

    // Métodos propios
    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado.");
    }

    public void subirVolumen() {
        if (encendido) volumen++;
    }

    public void bajarVolumen() {
        if (encendido && volumen > 0) volumen--;
    }

    public void subirCanal() {
        if (encendido) canal++;
    }

    public void bajarCanal() {
        if (encendido && canal > 1) canal--;
    }


    public String toString() {
        return "Televisor [Marca=" + marca + ", Pulgadas=" + pulgadas +", Canal=" + canal + ", Volumen=" + volumen +", Encendido=" + encendido + "]";
    }
}

