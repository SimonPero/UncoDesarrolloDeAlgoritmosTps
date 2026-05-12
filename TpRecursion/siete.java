package TpRecursion;

//7. Diseñar e implementar un algoritmo recursivo para calcular y mostrar la suma de cada una de
// las filas de una matriz de enteros. Utilice dos módulos recursivos, uno para recorrer la matriz
// y mostrar el resultado, y otro para el cálculo de la suma.
public class siete {
    public static void recorrerMatriz(int[][] matriz) {
        recursivoRecorrrer(matriz, matriz.length - 1);
    }

    public static void recursivoRecorrrer(int[][] matriz, int i) {
        if (i >= 0) {
            recursivoRecorrrer(matriz, i - 1);
            System.out.println("Sumar la fila " + i + " nos da " + calcularSuma(matriz[i], 0));
        }
    }

    public static int calcularSuma(int[] arr, int i) {
        int suma = 0;
        if (i < arr.length) {
            suma = arr[i] + calcularSuma(arr, i + 1);
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        recorrerMatriz(matriz);
    }

}
