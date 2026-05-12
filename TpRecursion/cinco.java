package TpRecursion;

//5. Diseñar e implementar un algoritmo recursivo que lea una secuencia de dígitos 

import java.util.Scanner;

// (en cada llamada recursiva debe leer un número) y cuente cuántos son múltiplos 
// de 3 hasta que se ingrese el valor 0.
public class cinco {
    public static int inputMultDeTres(Scanner sc) {
        int acu = 0;
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        if (num > 0 || num < 0) {
            if (num != 0 && num % 3 == 0) {
                acu = 1;
            }
            acu += inputMultDeTres(sc);
        }
        return acu;
    }

    public static int multiplosDeTres(int num) {
        int acu = 0;

        if (num > 0) {
            int dig = num % 10;

            if (dig % 3 == 0 && dig != 0) {
                acu = 1;
            }

            acu += multiplosDeTres(num / 10);
        }

        return acu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(multiplosDeTres(3691));
        System.out.println(multiplosDeTres(36091));
        System.out.println(inputMultDeTres(sc));

    }
}
