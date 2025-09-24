

import java.util.Scanner;

public class PruebaHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Ingrese la primera hora (h m s):");
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();

        Hora hora1 = new Hora(h1, m1, s1);

        
        System.out.println("Ingrese la segunda hora (h m s):");
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int s2 = scan.nextInt();

        Hora hora2 = new Hora(h2, m2, s2);

        
        System.out.println("RESULTADOS ");
        System.out.println("Hora 1: " + hora1.mostrarHora() + " (" + hora1.convertirAMinutos() + " minutos)");
        System.out.println("Hora 2: " + hora2.mostrarHora() + " (" + hora2.convertirAMinutos() + " minutos)");

      
        hora1.setHora(15);
        hora1.setMinutos(30);
        hora1.setSegundos(45);

        System.out.println("\nHora 1 modificada: " + hora1.mostrarHora());

        scan.close();
    }
}
