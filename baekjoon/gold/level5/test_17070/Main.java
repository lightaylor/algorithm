package baekjoon.gold.level5.test_17070;

import java.util.Scanner;

public class Main {
    static int N;
    static int[][] house;
    static int[][][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        house = new int[N][N];
        dp = new int[N][N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                house[i][j] = sc.nextInt();
            }
        }

        dp[0][1][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (house[i][j] == 1) {
                    continue;
                }

                dp[i][j][0] += dp[i][j - 1][0];
                dp[i][j][0] += dp[i][j - 1][2];

                if (i >= 1) {
                    dp[i][j][1] += dp[i - 1][j][1];
                    dp[i][j][1] += dp[i - 1][j][2];
                }

                if (i >= 1 && house[i - 1][j] == 0 && house[i][j - 1] == 0) {
                    dp[i][j][2] += dp[i - 1][j - 1][0];
                    dp[i][j][2] += dp[i - 1][j - 1][1];
                    dp[i][j][2] += dp[i - 1][j - 1][2];
                }
            }
        }

        int result = dp[N - 1][N - 1][0] + dp[N - 1][N - 1][1] + dp[N - 1][N - 1][2];
        System.out.print(result);
    }
}
