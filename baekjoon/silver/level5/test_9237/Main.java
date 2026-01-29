package baekjoon.silver.level5.test_9237;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] trees = new int[n];
        for (int i = 0; i < n; i++) trees[i] = sc.nextInt();
        Arrays.sort(trees);

        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            int day = trees[n - 1 - i] + (i + 1);
            maxDay = Math.max(maxDay, day);
        }

        System.out.print(maxDay + 1);
    }
}
