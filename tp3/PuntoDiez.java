package tp3;

import java.util.Scanner;

public class PuntoDiez {
    public static void main(String[] args) {
        String[] patentes = new String[10];
        String[] marcas = new String[10];
        String[] modelos = new String[10];
        int[] anios = new int[10];
        int cima = -1;

        // ejemplo: cargar algunos autos
        patentes[++cima] = "ABC123"; marcas[cima] = "Ford"; modelos[cima] = "Fiesta"; anios[cima] = 2015;
        patentes[++cima] = "XYZ999"; marcas[cima] = "Toyota"; modelos[cima] = "Corolla"; anios[cima] = 2018;
        patentes[++cima] = "QWE456"; marcas[cima] = "VW"; modelos[cima] = "Golf"; anios[cima] = 2020;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese patente a buscar: ");
        String buscar = sc.nextLine();

        String[] tempPat = new String[10];
        String[] tempMar = new String[10];
        String[] tempMod = new String[10];
        int[] tempAni = new int[10];
        int cimaTemp = -1;

        boolean encontrado = false;
        while (cima >= 0) {
            if (patentes[cima].equalsIgnoreCase(buscar)) {
                System.out.println("Auto encontrado: " + patentes[cima] + " - " +
                                   marcas[cima] + " " + modelos[cima] + " (" + anios[cima] + ")");
                encontrado = true;
                cima--; // lo eliminamos
                break;
            } else {
                tempPat[++cimaTemp] = patentes[cima];
                tempMar[cimaTemp] = marcas[cima];
                tempMod[cimaTemp] = modelos[cima];
                tempAni[cimaTemp] = anios[cima];
                cima--;
            }
        }

        while (cimaTemp >= 0) {
            patentes[++cima] = tempPat[cimaTemp];
            marcas[cima] = tempMar[cimaTemp];
            modelos[cima] = tempMod[cimaTemp];
            anios[cima] = tempAni[cimaTemp];
            cimaTemp--;
        }

        if (!encontrado) {
            System.out.println("Patente no encontrada.");
        }

        sc.close();
    }
}
