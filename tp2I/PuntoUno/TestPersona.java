

public class TestPersona {
    public static void main(String[] args) {

      
        Persona persona1 = new Persona("Franco", "Herrera", 21, 1234);
        Persona persona2 = new Persona("Felipe", "Costa", 38, 1255);

      
        boolean esMayor1 = persona1.esMayorDeEdad();
        boolean esMayor2 = persona2.esMayorDeEdad();

        
        System.out.println(persona1.getNombre() + " es mayor de edad? " + esMayor1);
        System.out.println(persona2.getNombre() + " es mayor de edad? " + esMayor2);

        // Imprimir datos completos con toString()
        System.out.println("\nDatos de persona1: " + persona1);
        System.out.println("Datos de persona2: " + persona2);
    }
}

