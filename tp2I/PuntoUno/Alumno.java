
public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private int edad;
    private String carrera;

    public Alumno(String nombre, String apellido, int legajo, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getLegajo() { return legajo; }
    public void setLegajo(int legajo) { this.legajo = legajo; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    
    public void rendirExamen() {
        System.out.println(nombre + " " + apellido + " está rindiendo un examen.");
    }

    public String toString() {
        return "Alumno [Nombre=" + nombre + ", Apellido=" + apellido + ", Legajo=" + legajo +
                ", Edad=" + edad + ", Carrera=" + carrera + "]";
    }
}
