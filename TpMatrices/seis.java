package TpMatrices;

import java.util.Scanner;

public class seis {
    public static void cargarMatriz(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe la deudad del socio " + i + " en el mes " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz cargada exitosamente");
    }

    public static boolean[] getDeudores(int[][] matriz) {
        boolean[] deudores = new boolean[10];
        int k;
        for (int i = 0; i < matriz.length; i++) {
            k = 0;
            for (int j = 0; j < matriz[0].length && k < 3; j++) {
                if (matriz[i][j] > 0) {
                    k++;
                }
            }
            if (k >= 3) {
                deudores[i] = true;
            }
        }
        return deudores;
    }

    public static int[] getMaxDeudor(int[][] matriz) {
        int[] deudor = { 0, -1000 };
        int deuda = 0;
        for (int i = 0; i < matriz.length; i++) {
            deuda = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                deuda += matriz[i][j];
            }
            if (deuda > deudor[1]) {
                deudor[0] = i;
                deudor[1] = deuda;
            }
        }
        return deudor;
    }

    public static String maxDeudaMes(int[][] matriz) {
        int[] mes = { 0, -1000 };
        int deuda = -1000;
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        for (int i = 0; i < matriz[0].length; i++) {
            deuda = 0;
            for (int j = 0; j < matriz.length; j++) {
                deuda += matriz[j][i];
            }
            if (deuda > mes[1]) {
                mes[0] = i;
                mes[1] = deuda;
            }
        }
        return meses[mes[0]];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] socios = new int[10][12];
        cargarMatriz(socios, sc);
        boolean end = true;
        while (end) {
            System.out.println("Menu");
            System.out.println("1.Mostrar deudores");
            System.out.println("2.Mostrar no deudores");
            System.out.println("3.Mostrar socio con más deuda");
            System.out.println("4.Mostrar mes más deuda");
            System.out.println("0.Terminar Programa");
            System.out.println("Elija una opcion");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    boolean[] deudores = getDeudores(socios);
                    for (int i = 0; i < deudores.length; i++) {
                        if (deudores[i]) {
                            System.out.println("El socio " + i + 1 + " es deudor");
                        }
                    }
                    break;
                case 2:
                    boolean[] noDeudores = getDeudores(socios);
                    for (int i = 0; i < noDeudores.length; i++) {
                        if (!noDeudores[i]) {
                            System.out.println("El socio " + (i + 1) + " es deudor");
                        }
                    }
                    break;
                case 3:
                    int[] deudor = getMaxDeudor(socios);
                    System.out.println("El socio " + deudor[0] + " es el mayor deudor");
                    System.out.println("con una deuda de " + deudor[1]);
                    break;

                case 4:
                    System.out.println("El mes con la mayor deuda es" + maxDeudaMes(socios));
                    break;
                case 0:
                    end = false;
                    System.out.println("Terminado Programa . . .");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        }
    }
}
