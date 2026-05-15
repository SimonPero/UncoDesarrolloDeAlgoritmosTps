package TpMatrices;

public class cinco {
    public static boolean cuadradoMagico(double[][] matriz) {
        boolean res = true;
        int fils = matriz.length;
        if (fils != matriz[0].length) {
            res = false;
        }

        if (res) {
            // Calculo a que tiene que ser igual todo
            int objetivo = 0;
            for (int i = 0; i < fils; i++) {
                objetivo += matriz[0][i];
            }

            // Reviso filas y columnas
            int sumF;
            int sumC;
            for (int i = 0; i < fils && res; i++) {
                sumC = 0;
                sumF = 0;
                for (int j = 0; j < fils; j++) {
                    sumF += matriz[i][j];
                    sumC += matriz[j][i];

                }
                if (sumC != objetivo || sumF != objetivo) {
                    res = false;
                }
            }

            // Reviso diagonales
            int priD = 0;
            int secuD = 0;
            for (int i = 0; i < fils; i++) {
                priD += matriz[i][i];
                secuD += matriz[i][fils - 1 - i];
            }
            if (priD != objetivo || secuD != objetivo) {
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double[][] cuadrado = {
                { 17, 24, 1, 8, 15 },
                { 23, 5, 7, 14, 16 },
                { 4, 6, 13, 20, 22 },
                { 10, 12, 19, 21, 3 },
                { 11, 18, 25, 2, 9 }
        };
        System.out.println(cuadradoMagico(cuadrado));
    }
}