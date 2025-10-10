

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha (día mes año): ");
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int a1 = scan.nextInt();

        Fecha f1 = new Fecha(d1, m1, a1);

       
        System.out.println("Ingrese la segunda fecha (día mes año): ");
        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int a2 = scan.nextInt();

        Fecha f2 = new Fecha(d2, m2, a2);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Fecha 1: " + f1.mostrarFecha());
        System.out.println("Fecha 2: " + f2.mostrarFecha());

        
        f1.setDia(15);
        f1.setMes(9);
        f1.setAnio(2025);

        System.out.println("\nFecha 1 modificada: " + f1.mostrarFecha());

        scan.close();
    }
}
