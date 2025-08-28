import java.util.Scanner;
    public class ejerciciopractica {
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
                  
        System.out.println("¿Ingrese el Primer Numero?");
        int num1 = scan.nextInt();

        System.out.println("¿Ingrese el segundo numero");
        int num2 = scan.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado del producto es " + producto);
        System.out.println("El resultado de la divison es " + division);

        scan.close();
    }
}


       
    