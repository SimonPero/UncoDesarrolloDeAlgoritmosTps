/**
 * 2) Con matrices/arreglos:
 * e) Dado un arreglo de enteros retorne la cantidad de elementos mayores al
 * promedio
 */
public class dosE {
    public static int recurNumsMayorProd(int[] nums, int i, int prom) {
        int acu = 0;
        if (i < nums.length) {
            if (nums[i] > prom) {
                System.out.println(nums[i]);
                acu = 1;
            }
            acu += recurNumsMayorProd(nums, i + 1, prom);
        }
        return acu;
    }

    public static int recurCalcularProd(int[] nums, int i) {
        int suma = 0;
        if (i < nums.length) {
            suma = nums[i] + recurCalcularProd(nums, i + 1);
        }
        return suma;

    }

    public static void main(String[] args) {
        // 79.2
        int[] arr = { 97, 86, -92, -71, -50 };
        int largo = arr.length;
        int prod = recurCalcularProd(arr, 0) / largo;
        System.out.println("Los numero mayores al promedio del arreglo es: " + recurNumsMayorProd(arr, 0, prod));
    }
}