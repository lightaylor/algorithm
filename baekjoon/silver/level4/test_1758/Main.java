package silver.level4.test_1758;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sum = 0;
        int[] tipArr = new int[n];
        for (int i = 0; i < n; i++) tipArr[i] = sc.nextInt();

        Arrays.sort(tipArr);
        for (int i = 0; i < n; i++) {
            int cost = tipArr[i] - (n - i - 1);
            sum += Math.max(cost, 0);

        }

        System.out.print(sum);
    }
}
