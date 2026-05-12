package TpMatrices;

public class doce {
    public static void ponerCeros(int[][] matriz, int[] maxPos) {
        for (int j = maxPos[1] + 1; j < matriz[0].length; j++) {
            matriz[maxPos[0]][j] = 0;
        }
    }

    public static int[] encontrarMaximoCol(int[][] matriz, int j) {
        int max = -1000;
        int[] maxPos = { 0, 0 };
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][j] > max) {
                maxPos[0] = i;
                maxPos[1] = j;
                max = matriz[i][j];
            }
        }
        ponerCeros(matriz, maxPos);
        return maxPos;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 3, 12, 7, 1, 9 },
                { 14, 5, 2, 11, 6 },
                { 8, 15, 4, 10, 13 },
                { 2, 9, 14, 3, 7 },
                { 11, 6, 1, 8, 5 }
        };
        int filas = matriz.length;
        for (int i = 0; i < filas; i++) {
            int[] maxPos = encontrarMaximoCol(matriz, i);
            int[] temp = matriz[i];
            matriz[i] = matriz[maxPos[0]];
            matriz[maxPos[0]] = temp;
        }
        mostrarMatriz(matriz);
    }
}