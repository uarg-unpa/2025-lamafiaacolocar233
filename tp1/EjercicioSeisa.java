import java.util.Scanner;
    public class EjercicioSeisa{
        public static void main(String[]args) {
            Scanner scan = new Scanner(System.in);
                 System.out.println(System.in);

                 System.out.println("Ingrese el Primer Numero");
                 int num1 = scan.nextInt();

                 System.out.println("Ingrese el Segundo Numero");
                 int num2 = scan.nextInt();
                
                 System.out.println("Ingrese el Tercer Numero");
                 int num3 = scan.nextInt();

                 int producto = num1 * num2 * num3;
                 int suma = num1 + num2 +num3;

                 System.out.println("Suma de Enteros: " + suma);
                 System.out.println("Producto de Entero: " + producto);

                 scan.close();

        
                }   
            } 
