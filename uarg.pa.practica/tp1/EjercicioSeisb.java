import java.util.Scanner;
public class EjercicioSeisb {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int producto = 1;
        int cont = 1;

        while (cont<=3) {
            System.out.println("Ingrese un Numero: ");
             num = scan.nextInt();
            
             suma = suma +num;
             producto = producto * num;
             cont = cont + 1;

             System.out.println("Suma de Enteros: " + suma);
             System.out.println("Producto de enteros: " + producto);
        }
            scan.close();
    }    
}

