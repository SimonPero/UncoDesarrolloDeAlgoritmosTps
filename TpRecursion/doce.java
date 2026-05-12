package TpRecursion;

public class doce {
    // 12. Diseñar e implementar un algoritmo recursivo que dado un arreglo
    // de caracteres y un caracter indique si se encuentra el caracter en
    // el arreglo dado.
    public static boolean existeChar(char[] arr, char letra) {
        return recurExisteChar(arr, letra, 0);
    }

    public static boolean recurExisteChar(char[] arr, char letra, int i) {
        boolean res = false;
        if (i < arr.length && !res) {
            if (arr[i] == letra) {
                res = true;
            } else {
                res = recurExisteChar(arr, letra, i + 1);
            }
        }
        return res;
    }

    /**
     * public static boolean recurExisteChar(char[] arr, char letra, boolean res,
     * int i) {
     * if (i < arr.length && !res) {
     * res = (arr[i] == letra);
     * res = recurExisteChar(arr, letra, res, i + 1);
     * }
     * return res;
     * }
     */

    public static void main(String[] args) {
        char[] arr = { 't', 'u', 'm', 'a', 'm', 'a', 'm', 'a', 'f', 'e', 'a' };
        System.out.println(existeChar(arr, 'f'));
    }
}
