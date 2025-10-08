

import java.util.Scanner;

public class PuntoNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese expresión: ");
        String expr = sc.nextLine();

        char[] pila = new char[expr.length()];
        int cima = -1;
        boolean correcto = true;

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                pila[++cima] = ch;
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (cima == -1) { correcto = false; break; }
                char top = pila[cima--];
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    correcto = false; break;
                }
            }
        }

        if (cima != -1) correcto = false;
        System.out.println(correcto ? "Expresión correcta" : "Expresión incorrecta");

        sc.close();
    }
}


