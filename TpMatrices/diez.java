package TpMatrices;

import java.util.Scanner;

public class diez {
    public static void cargarMatriz(int[][] matriz, Scanner sc) {
        System.out.println("Cargando matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe el numero a cargar en la posicion [" + i + "] [" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static int[] generarArr(int[][] matriz, int col) {
        int[] arr = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            arr[i] = matriz[i][col];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de filas");
        int fils = sc.nextInt();
        System.out.println("Dime la cantidad de columnas");
        int cols = sc.nextInt();
        int[][] matriz = new int[fils][cols];
        cargarMatriz(matriz, sc);
        System.out.println("Dime la columna de la cual generar el arreglo");
        int col = sc.nextInt();
        int[] arr = generarArr(matriz, col);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
