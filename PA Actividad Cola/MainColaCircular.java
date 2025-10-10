
public class MainColaCircular {
    public static void main(String[] args) {
       ColaCircular cola = new ColaCircular();

        //Encolar el 10-20-30
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        // Desencolar un numero (En este caso el 10)

        cola.desencolar();
        cola.mostrar();

        // Encolar el 40 y 50

        cola.encolar(40);
        cola.encolar(50);

        // Desencolar un numero (20)

        cola.desencolar();
        cola.mostrar();

        // Encolar el 60

        cola.encolar(60);
        cola.mostrar();

        System.out.println(" Simulacion FINALIZADA ");
    }
    
}
