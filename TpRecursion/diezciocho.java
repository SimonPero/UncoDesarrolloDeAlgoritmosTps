package TpRecursion;

import java.util.Scanner;

/**
 * Dados dos números N y B, tales que B<N, podemos hacer que N explote usando a
 * B como bomba. Cuando N explota se parte en dos números N1=(N div B) y N2=N-(N
 * div B). Pero B produce una reacción en cadena: si N1 (y/o N2) es mayor que B,
 * también explota y se parte nuevamente en dos pedazos, según el criterio
 * anterior. Esto se repite hasta que todos los pedazos resultantes a partir de
 * N sean menores o iguales que B.
 * 
 * Ej,: Si N=15, y la bomba B=3, el número N se parte inicialmente en dos: 15
 * div 3, y 15-(15 div 3), es decir, 5 y 10. Como ambos son mayores que la
 * bomba, deben estallar en dos. El proceso se repite según lo muestra la
 * figura.
 * Escriba un procedimiento recursivo Explotar, que dado un número N y un número
 * bomba B, imprima todos los pedazos que quedan al explotar N usando B. Ej.: En
 * el caso que muestra la figura, deberá imprimirse 1,1,3,3,2,1,1,3
 */
public class diezciocho {
    // N1=(N div B) y N2=N-(N* div B)
    public static void explotarBomba(int n, int b) {
        if (n > b) {
            int n1 = n / b;
            int n2 = n - (n / b);
            explotarBomba(n1, b);
            explotarBomba(n2, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = true;
        int n = 0;
        int b = 0;
        while (end) {
            System.out.println("Ingresar un numero N");
            n = sc.nextInt();
            System.out.println("Ingresar un numero B menor a N");
            b = sc.nextInt();
            System.out.println();
            if (b < n) {
                end = false;
            }
        }
        explotarBomba(n, b);
    }
}
