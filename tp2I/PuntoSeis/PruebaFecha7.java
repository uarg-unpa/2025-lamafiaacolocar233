package tp2.PuntoSeis;

import java.util.Scanner;

public class PruebaFecha7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha (día mes año): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int a1 = sc.nextInt();
        Fecha f1 = new Fecha(d1, m1, a1);

       
        System.out.println("Ingrese la segunda fecha (día mes año): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int a2 = sc.nextInt();
        Fecha f2 = new Fecha(d2, m2, a2);

        // Mostrar fechas en formato dd/mm/aaaa
        System.out.println("\n--- FECHAS ---");
        System.out.println("Fecha 1: " + String.format("%02d/%02d/%04d", f1.getDia(), f1.getMes(), f1.getAnio()));
        System.out.println("Fecha 2: " + String.format("%02d/%02d/%04d", f2.getDia(), f2.getMes(), f2.getAnio()));

       
        System.out.println("\n--- RESULTADO ---");
        if (f1.getAnio() > f2.getAnio()) {
            System.out.println("La fecha con mayor año es: " + String.format("%02d/%02d/%04d", f1.getDia(), f1.getMes(), f1.getAnio()));
        } else if (f2.getAnio() > f1.getAnio()) {
            System.out.println("La fecha con mayor año es: " + String.format("%02d/%02d/%04d", f2.getDia(), f2.getMes(), f2.getAnio()));
        } else {
            System.out.println("Ambas fechas tienen el mismo año.");
        }

        sc.close();
    }
}
