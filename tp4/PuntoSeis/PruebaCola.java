public class PruebaCola {
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();

       
        cola1.insertar(10);
        cola1.insertar(20);
        cola1.insertar(30);

        cola2.insertar(10);
        cola2.insertar(20);
        cola2.insertar(30);

        System.out.println("Cola 1:");
        cola1.mostrar();

        System.out.println("Cola 2:");
        cola2.mostrar();

        // Comparacion
        if (cola1.sonIdenticas(cola2)) {
            System.out.println("✅ Las colas son idénticas.");
        } else {
            System.out.println(" Las colas NO son idénticas.");
        }


        cola2.borrar();
        cola2.insertar(40);

        System.out.println("\nNueva comparación:");
        cola1.mostrar();
        cola2.mostrar();

        if (cola1.sonIdenticas(cola2)) {
            System.out.println("✅ Las colas son idénticas.");
        } else {
            System.out.println(" Las colas NO son idénticas.");
        }
    }
}
