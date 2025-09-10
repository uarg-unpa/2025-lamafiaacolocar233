import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un día (L, M, I, J, V): ");
        char dia = scan.next().charAt(0); 

        switch (dia) {
            case 'L': {
                System.out.println("HOY NO TENGO RESOLUCION (Lunes)");
                break;
            }
            case 'M': {
                System.out.println("HOY TENGO RESOLUCION (Martes)");
                break;
            }
            case 'I': {
                System.out.println("HOY TENGO RESOLUCION (Miércoles)");
                break;
            }
            case 'J': {
                System.out.println("HOY TENGO RESOLUCION (Jueves)");
                break;
            }
            case 'V': {
                System.out.println("HOY TENGO RESOLUCION (Viernes)");
                break;
           
            }
            default: {
                System.out.println("Día inválido");
            }
        }

        scan.close();
    }
}
