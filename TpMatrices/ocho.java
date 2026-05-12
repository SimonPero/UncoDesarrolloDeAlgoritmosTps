package TpMatrices;

public class ocho {
    public static boolean[] tipoMatriz(int[][] matriz) {
        boolean[] tipo = { true, true };

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != 0) {
                tipo[1] = false;
            }

            for (int j = i + 1; j < matriz.length; j++) {
                if (tipo[0] && matriz[i][j] != matriz[j][i]) {
                    tipo[0] = false;
                }
                if (tipo[1] && matriz[i][j] != -matriz[j][i]) {
                    tipo[1] = false;
                }
            }
        }
        return tipo;
    }

    public static void main(String[] args) {
        int[][] cuadrado = {
                { 0, 2, 9, 13 },
                { 2, 0, 10, 14 },
                { 9, 10, 0, 15 },
                { 13, 14, 15, 0 },
        };
        boolean[] tipo = tipoMatriz(cuadrado);

        if (tipo[1]) {
            System.out.println("Es una matriz anti-simetrica");
        } else if (tipo[0]) {
            System.out.println("Es una matriz simetrica");
        } else {
            System.out.println("No es simetrica ni anti-simetrica");
        }
    }
}
