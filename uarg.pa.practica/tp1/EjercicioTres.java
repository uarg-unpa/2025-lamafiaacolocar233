import java.util.Scanner;
public class EjercicioTres {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
            int AUX, B, A, C;

            System.out.print("Ingrese el valor para A: ");
             A = scan.nextInt();
            System.out.println("Ingrese el valor a B: ");
             B = scan.nextInt();
            System.out.println("Ingrese un valor para C: ");
            C = scan.nextInt();

            AUX = C;
            B = A;
            C = A;
            A = AUX;
        System.out.println("Resultados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        scan.close();

    }
}