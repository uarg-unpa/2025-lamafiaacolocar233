

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    
    public Fecha(int dia, int mes, int anio) {
        if (esFechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
           
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }

    //
    private boolean esFechaValida(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        if (esBisiesto(a)) {
            diasPorMes[1] = 29;
        }

        return d <= diasPorMes[m - 1];
    }

   
    private boolean esBisiesto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

  
    public void setDia(int d) {
        if (esFechaValida(d, this.mes, this.anio)) {
            this.dia = d;
        }
    }

    public void setMes(int m) {
        if (esFechaValida(this.dia, m, this.anio)) {
            this.mes = m;
        }
    }

    public void setAnio(int a) {
        if (esFechaValida(this.dia, this.mes, a)) {
            this.anio = a;
        }
    }

    
    public String getNombreMes() {
        String[] nombres = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return nombres[this.mes - 1];
    }

    public String mostrarFecha() {
        return dia + " de " + getNombreMes() + " de " + anio;
    }
}
