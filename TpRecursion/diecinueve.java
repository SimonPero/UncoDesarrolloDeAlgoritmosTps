package TpRecursion;

import java.util.Scanner;

/**
 * 19.Escriba un planteo y procedimiento recursivo para imprimir una pirámide de
 * dígitos como se muestra en la siguiente figura. Utilice un procedimiento
 * recursivo para generar cada una de las filas de la pirámide. Realice una
 * traza para verificar su correcto funcionamiento. La cantidad de renglones
 * depende de un n ingresado por el usuario (en el caso del ejemplo es 8)
 */
public class diecinueve {
    public static void generarMediaPiramide(int num) {
        recurGenerarMedPi(num, 1);
    }

    /**
     * //Este ejercicio esta mal por que usamos renglonD y renglonI como parametros
     * public static void recurGenerarMedPi(int num, int i, String renglonD, String
     * renglonI) {
     * if (i <= num) {
     * for (int j = i; j < num; j++) {
     * System.out.print(" ");
     * }
     * System.out.println(renglonI + i + renglonD);
     * 
     * recurGenerarMedPi(num, i + 1, (i + renglonD), (renglonI + i));
     * }
     * }
     */

    public static void recurGenerarMedPi(int num, int i) {
        if (i <= num) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            System.out.println(renglonI(i - 1) + i + renglonD(i - 1));
            recurGenerarMedPi(num, i + 1);
        }
    }

    public static String renglonI(int i) {
        String renglon = "";
        if (i > 0) {
            renglon = renglonI(i - 1) + (i);
        }
        return renglon;
    }

    public static String renglonD(int i) {
        String renglon = "";
        if (i > 0) {
            renglon = (i) + renglonD(i - 1);
        }
        return renglon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de renglones de la media piramide");
        int num = sc.nextInt();
        System.out.println();
        generarMediaPiramide(num);
    }
}
