package baekjoon.gold.level4.test_17404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int[][] house;
    private static int[][] dp;
    private static int N;
    private static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());

        house = new int[N][3];
        dp = new int[N][3];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            house[i] = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int startColor = 0; startColor < 3; startColor++) {
            for (int j = 0; j < 3; j++) {
                if (j == startColor) dp[0][j] = house[0][j];
                else dp[0][j] = 1_001;
            }

            for (int i = 1; i < N; i++) {
                dp[i][0] = house[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = house[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = house[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            }

            for (int endColor = 0; endColor < 3; endColor++) {
                if (endColor != startColor) {
                    min = Math.min(min, dp[N - 1][endColor]);
                }
            }
        }

        System.out.print(min);
    }
}
