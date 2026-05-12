package TpArr;

import java.util.Arrays;
import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] multiplos = new int[10];
        for (int i = 0; i < 10; i++) {
            multiplos[i] = (1 + i) * num;
        }
        System.out.println(Arrays.toString(multiplos));
    }
}
