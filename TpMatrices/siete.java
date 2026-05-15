package TpMatrices;

public class siete {
    public static void filasAtrasAdelante(int[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void columnasArribaAbajo(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void spiral(int[][] matriz) {
        int arriba = 0;
        int abajo = matriz.length - 1;
        int izq = 0;
        int der = matriz[0].length - 1;

        while (izq <= der || arriba <= abajo) {
            for (int i = izq; i < der; i++) {
                System.out.println(matriz[arriba][i]);
            }
            arriba++;
            for (int i = arriba; i > abajo; i--) {
                System.out.println(matriz[i][der]);
            }
            der--;

            if (arriba <= abajo) {
                for (int i = der; i > izq; i--) {
                    System.out.println(matriz[abajo][i]);
                }
                abajo--;
            }
            if (izq <= der) {
                for (int i = abajo; i < arriba; i++) {
                    System.out.println(matriz[i][izq]);
                }
                izq++;
            }
        }
    }

    public static void zigZag(int[][] matriz) {
        int arriba = 0;
        int izq = 0;
        int der = matriz[0].length - 1;
        while (arriba < matriz.length) {
            for (int i = 0; i <= der; i++) {
                System.out.print(matriz[arriba][i] + " ");
            }
            arriba++;
            if (arriba < matriz.length) {
                for (int i = der; i > izq; i--) {
                    System.out.print(matriz[arriba][i] + " ");
                }
                arriba++;
            }
        }
    }
}
