package TpRecursion;

/**
 * 15. Diseñar e implementar un algoritmo recursivo que dado una cadena de
 * caracteres cuente cuantas vocales contiene.
 */
public class quince {
    public static int contarVocales(char[] arr) {
        return recurContarVoc(arr, 0, 0);
    }

    public static int recurContarVoc(char[] arr, int i, int vocales) {
        if (i < arr.length) {
            char c = Character.toLowerCase(arr[i]);
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            }
            vocales = recurContarVoc(arr, i + 1, vocales);
        }
        return vocales;
    }

    public static void main(String[] args) {
        char[] arr = { 't', 'u', 'm', 'a', 'm', 'a', 'm', 'a', 'f', 'e', 'a' };
        System.out.println(contarVocales(arr));
    }
}
