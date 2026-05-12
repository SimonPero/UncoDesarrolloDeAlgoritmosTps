package TpRecursion;

/**
 * 13. Diseñar e implementar un algoritmo recursivo que obtenga el número mayor
 * de una matriz numérica.
 */
public class trece {
    public static int encontrarMax(int[][] matriz) {
        return recurMax(matriz, 0, 0, -1000);
    }

    public static int recurMax(int[][] matriz, int i, int j, int max) {
        if (i < matriz.length) {
            if (j < matriz[i].length) {
                max = Math.max(max, matriz[i][j]);
                max = recurMax(matriz, i, j + 1, max); 
            } else {
                max = recurMax(matriz, i + 1, 0, max); 
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 54, 123 },
                { 123124, 8, 91 }
        };
        System.out.println(encontrarMax(matriz));
    }
}
