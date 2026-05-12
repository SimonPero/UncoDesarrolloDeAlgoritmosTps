package TpMatrices;

public class once {
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generarTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        int[][] transpuesta = new int[cols][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 4, 7 },
                { 2, 5, 8 },
        };
        mostrarMatriz(matriz);
        System.out.println();
        mostrarMatriz(generarTranspuesta(matriz));
    }
}
