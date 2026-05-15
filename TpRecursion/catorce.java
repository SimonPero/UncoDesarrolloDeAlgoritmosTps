package TpRecursion;

/**
 * 14. Dada una matriz de enteros implementar un algoritmo recursivo que calcule
 * la suma de los elementos de cada columna y vaya mostrando el valor sumado
 * para
 * cada columna.
 */
public class catorce {
    public static void mostrarSumaCols(int[][] matriz) {
        recurMostrarCols(matriz, 0);
    }

    /**
     * Esta funcion esta mal porque usa suma, que es lo que mostramos, como
     * parametro
     * public static void recurMostrarSumaCols(int[][] matriz, int i, int j, int
     * suma) {
     * if (j < matriz[0].length) {
     * if (i < matriz.length) {
     * recurMostrarSumaCols(matriz, i + 1, j, (suma + matriz[i][j]));
     * } else {
     * System.out.println("El resultado de sumar la columna " + j + " es de " +
     * suma);
     * recurMostrarSumaCols(matriz, 0, j + 1, 0);
     * }
     * }
     * }
     */
    public static void recurMostrarCols(int[][] matriz, int j) {
        if (j < matriz[0].length) {
            int suma = recurSumaCols(matriz, 0, j);
            System.out.println("El resultado de sumar la columna " + j + " es de " + suma);
            recurMostrarCols(matriz, j + 1);
        }
    }
    public static int recurSumaCols(int[][] matriz, int i, int j) {
        int suma = 0;
        if (i < matriz.length) {
            suma = matriz[i][j] + recurSumaCols(matriz, i + 1, j);
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 13, 11, 10 },
                { 1, 4, 1 }
        };

        mostrarSumaCols(matriz);
    }
}
