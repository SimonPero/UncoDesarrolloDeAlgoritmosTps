package TpMatrices;

import java.util.Scanner;

public class nueve {
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cargarMatriz(int[][] matriz, Scanner sc) {
        System.out.println("Cargando matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe el numero a cargar en la posicion [" + i + "] [" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void cargarArr(int[] arr, Scanner sc) {
        System.out.println("cargando arreglo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Escribe el numero a cargar en la posicion [" + i + "]");
            arr[i] = sc.nextInt();
        }
    }

    public static void reemplazarFila(int[][] matriz, int[] arr, int fil) {
        System.out.println("Matriz original");
        mostrarMatriz(matriz);
        for (int i = 0; i < arr.length; i++) {
            matriz[fil][i] = arr[i];
        }
        System.out.println("Matriz modificada");
        mostrarMatriz(matriz);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de filas");
        int fils = sc.nextInt();
        System.out.println("Dime la cantidad de columnas");
        int cols = sc.nextInt();
        int[][] matriz = new int[fils][cols];
        int[] arr = new int[cols];
        cargarMatriz(matriz, sc);
        cargarArr(arr, sc);
        System.out.println("Dime que fila quieres reemplazar con el arreglo");
        int fil = sc.nextInt();
        reemplazarFila(matriz, arr, fil);
    }
}