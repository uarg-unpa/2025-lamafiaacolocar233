

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    
    public Hora(int hora, int minutos, int segundos) {
        if (esHoraValida(hora, minutos, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    
    private boolean esHoraValida(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }


    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    public int convertirAMinutos() {
        return hora * 60 + minutos;
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
