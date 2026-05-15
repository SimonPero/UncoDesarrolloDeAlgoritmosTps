package TpRecursion;

import java.util.Scanner;

public class diez {
    // 10. Diseñar e implementar un algoritmo recursivo que lea una secuencia de
    // caracteres
    // hasta que se ingrese el punto y retorne una frase formada por los caracteres
    // en el orden leído.
    public static String ingresarFrase(Scanner sc) {
        return recurFrase(sc, true);
    }

    // revisar como hacer para no usar frase como paremtro
    /**
     * Esta funcion esta mal por que usa Frase, que es lo que retorna al final, como
     * parametro
     * public static String recurFrase(Scanner sc, String frase, boolean end) {
     * if (end) {
     * System.out.println("Ingrese un caracter");
     * String input = sc.nextLine();
     * char letra = input.isEmpty() ? ' ' : input.charAt(0);
     * if (letra == '.') {
     * end = false;
     * }
     * frase = recurFrase(sc, frase + letra, end);
     * }
     * return frase;
     * }
     */
    public static String recurFrase(Scanner sc, boolean end) {
        String frase = "";
        if (end) {
            System.out.println("Ingrese un caracter");
            String input = sc.nextLine();
            char letra = input.isEmpty() ? ' ' : input.charAt(0);
            if (letra == '.') {
                end = false;
            } else {
                frase = letra + recurFrase(sc, end);
            }
        }
        return frase;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ingresarFrase(sc));
    }
}
