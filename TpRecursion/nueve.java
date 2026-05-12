package TpRecursion;

public class nueve {
    /**
     * Diseñar e implementar un algoritmo recursivo que, dados dos números positivos
     * (dividendo y divisor), calcule la división entera mediante restas sucesivas.
     *
     * El método consiste en restar repetidamente el divisor al dividendo hasta que
     * el resultado sea menor que el divisor.
     *
     * - El valor final obtenido es el resto.
     * - La cantidad de restas realizadas corresponde al cociente.
     *
     * Ejemplo:
     * 56 / 15
     * 56 - 15 = 41
     * 41 - 15 = 26
     * 26 - 15 = 11 → resto (11 < 15)
     *
     * Resultado:
     * Cociente = 3 (cantidad de restas)
     * Resto = 11
     */

    public static void calRestoCociente(int dividendo, int divisor) {
        int[] arr = { dividendo, divisor, 0 };
        int[] res = recurResCoc(arr);
        System.out.println("El resto es de " + res[0]);
        System.out.println("El cociente es de " + res[2]);
    }

    public static int[] recurResCoc(int[] arr) {
        if (arr[0] >= arr[1]) {
            arr[0] = arr[0] - arr[1];
            arr[2] = arr[2] + 1;
            arr = recurResCoc(arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        calRestoCociente(30, 15);
    }
}
