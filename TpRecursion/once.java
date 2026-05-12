package TpRecursion;

//11. Diseñar e implementar un algoritmo recursivo que dado un arreglo de números
//  realice dos sumas separadas, por un lado los números en las posiciones pares 
// y por el otro las posiciones impares.
public class once {

    public static int[] sumarArr(int[] arr) {
        int[] res = { 0, 0 };
        return recurSumar(arr, 0, res);
    }

    public static int[] recurSumar(int[] arr, int i, int[] res) {
        if (i < arr.length) {
            if (i % 2 == 0) {
                res[0] += arr[i];
            } else {
                res[1] += arr[i];
            }
            res = recurSumar(arr, i + 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] res = sumarArr(arr);
        System.out.println("La suma de pares es de " + res[0]);
        System.out.println("La syna de impares es de " + res[1]);
    }
}
