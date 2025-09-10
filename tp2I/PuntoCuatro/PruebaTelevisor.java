package tp2.PuntoCuatro;

import java.util.Scanner;
public class PruebaTelevisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese la marca del televisor: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el tamaño en pulgadas: ");
        int pulgadas = sc.nextInt();

     
        Televisor tv = new Televisor(marca, pulgadas);

        // Mostrar estado inicial
        System.out.println("\nEstado inicial del televisor:");
        System.out.println(tv.mostrarInfo());

        
        System.out.print("\nIngrese un canal al que desea cambiar: ");
        int canal = sc.nextInt();
        tv.cambiarCanal(canal);

        System.out.print("¿Cuántas veces quiere subir el volumen? ");
        int subidas = sc.nextInt();
        for (int i = 0; i < subidas; i++) {
            tv.subirVolumen();
        }

        
        System.out.print("¿Cuántas veces quiere bajar el volumen? ");
        int bajadas = sc.nextInt();
        for (int i = 0; i < bajadas; i++) {
            tv.bajarVolumen();
        }

       
        System.out.println("\nEstado final del televisor:");
        System.out.println(tv.mostrarInfo());

        sc.close();
    }
}

