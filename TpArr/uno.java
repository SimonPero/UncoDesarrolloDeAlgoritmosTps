package TpArr;

import java.util.Scanner;

public class uno {
    public static char[] cargarArr(int len, Scanner scanner) {
        char[] charArr = new char[len];
        for (int i = 0; i < len; i++) {
            System.out.println("ingrese char");
            charArr[i] = (char) scanner.next().charAt(0);
        }
        return charArr;
    }

    public static void mostrar(char[] arr, boolean invertir) {
        if (invertir) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        System.out.println("ingrese el largo del array");
        len = scanner.nextInt();
        scanner.nextLine();

        char[] arr = cargarArr(len, scanner);
        System.out.println("mostrar arreglo invertido? Si o No");
        String invertido = scanner.next().toLowerCase();
        if (invertido.equals("si")) {
            mostrar(arr, true);
        } else {
            mostrar(arr, false);
        }
    }
}
