package TpRecursion;

import java.util.Scanner;

/**
 * Escriba un planteo recursivo para dibujar una media pirámide de dígitos como
 * se muestra en la siguiente figura. La cantidad de renglones depende de un n
 * ingresado por el usuario (en el caso del ejemplo es 9)
 * 1
 * 21
 * 321
 * 4321
 * 54321
 * 654321
 * 7654321
 * 87654321
 * 987654321
 * 
 */
public class diezcisiete {

    public static void generarMediaPiramide(int num) {
        recurGenerarMedPi(num, 1, "");
    }

    public static void recurGenerarMedPi(int num, int i, String renglon) {
        if (i <= num) {
            System.out.println(i + renglon);
            recurGenerarMedPi(num, i + 1, i + renglon);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de renglones de la media piramide");
        int num = sc.nextInt();

        generarMediaPiramide(num);
    }
}
