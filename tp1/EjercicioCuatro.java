import java.util.Scanner;
    public class EjercicioCuatro {
        public static void main (String[]args) {
            Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese el primer numero");
                int NRO1 = scan.nextInt();

                System.out.println("Ingrese el Segundo numero");
                int NRO2 = scan.nextInt();
                
                System.out.println("Ingrese el tercer numero");
                int NRO3 = scan.nextInt();

                if (NRO1 > NRO2 && NRO1 > NRO3) {
                    System.out.println("El mayor es: " + NRO1);
                }
                    else if(NRO2 > NRO1 && NRO2 > NRO3) {
                        System.out.println("El numero mayor es: " + NRO2);
                       }
                        else {
                            System.out.println("El mayor es: " + NRO3);
                        }

                scan.close();
        }
    }