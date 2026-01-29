package baekjoon.gold.level3.test_11049;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[][] arr = new int[T][2];
        for (int i = 0; i < T; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        long[] p = new long[T + 1];
        p[0] = arr[0][0];
        for (int i = 0; i < T; i++) {
            p[i + 1] = arr[i][1];
        }

        long[][] dp = new long[T][T];
        for (int i = 0; i < T; i++) Arrays.fill(dp[i], Long.MAX_VALUE);
        for (int i = 0; i < T; i++) dp[i][i] = 0;

        for (int count = 1; count < T; count++) {
            for (int start = 0; start < T - count; start++) {
                int end = start + count;
                long best = Long.MAX_VALUE;
                for (int mid = start; mid < end; mid++) {
                    long cost = dp[start][mid] + dp[mid + 1][end] + p[start] * p[mid + 1] * p[end + 1];
                    best = Math.min(best, cost);
                }
                dp[start][end] = best;
            }
        }

        System.out.print(dp[0][T - 1]);
    }
}
