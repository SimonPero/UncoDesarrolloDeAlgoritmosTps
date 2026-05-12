package TpMatrices;

public class sudoku {
    public static void mostrar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        int[] apariciones = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        int i = 0;
        boolean end = true;
        while (i < sudoku.length && end) {
            int j = 0;
            while (j < sudoku.length) {
                apariciones[sudoku[i][j] - 1]++;
                j++;
            }
            int k = 0;
            while (k < apariciones.length && end) {
                if (apariciones[k] > 1) {
                    System.out.println(k);
                    System.out.println(apariciones[k]);
                    end = false;
                }
                k++;
            }
            apariciones = new int[9];
            ;
            i++;
        }
        int col = 0;
        while (col < sudoku.length && end) {
            int fila = 0;

            while (fila < sudoku.length) {
                apariciones[sudoku[fila][col] - 1]++;
                fila++;
            }

            int k = 0;
            while (k < apariciones.length && end) {
                if (apariciones[k] > 1) {
                    System.out.println("Error en columna: " + col);
                    System.out.println("Número repetido: " + (k + 1));
                    end = false;
                }
                k++;
            }

            apariciones = new int[9]; // reiniciar contador
            col++;
        }
    }
}
