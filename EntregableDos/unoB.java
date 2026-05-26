/**
 * Con números enteros:
 * b) Retornar la cantidad de dígitos impares
 * 
 */

public class unoB {
    public static int recurDigitosImpares(int num) {
        int acu = 0;
        if (num > 0 || num < 0) {
            int comp = num % 10;
            if (comp % 2 != 0) {
                acu = 1 + recurDigitosImpares(num / 10);
            } else {
                acu = acu + recurDigitosImpares(num / 10);
            }
        }
        return acu;
    }

    public static void main(String[] args) {
        int num = 123456789;
        System.out.println("El num " + num + " tiene tantos impares " + recurDigitosImpares(num));
    }
}