package baekjoon.silver.level3.test_14501.v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int day = arr[i][0];
            int cost = arr[i][1];
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            if (i + day <= N) {
                dp[i + day] = Math.max(dp[i + day], dp[i] + cost);
            }
        }
        System.out.print(dp[N]);
    }
}
