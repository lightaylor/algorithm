package baekjoon.gold.level5.test_12865;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int max = arr[1];
        int[][] dp = new int[n + 1][max + 1];

        for (int i = 1; i <= n; i++) {
            arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 1; j <= max; j++) {
                if (arr[0] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[0]] + arr[1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        bw.write(String.valueOf(dp[n][max]));
        bw.close();
    }
}
