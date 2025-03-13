package silver.level2.test_14400;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);
        long middleX = x[(int) (n / 2)];
        long middleY = y[(int) (n / 2)];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(x[i] - middleX) + Math.abs(y[i] - middleY);
        }
        System.out.print(sum);
    }
}
