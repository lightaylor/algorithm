package baekjoon.silver.level3.test_1003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] dp = new int[41][2];
        dp[0] = new int[]{1, 0};
        dp[1] = new int[]{0, 1};

        for (int i = 2; i < 41; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(br.readLine());
            bw.write(dp[a][0] + " " + dp[a][1] + "\n");
        }

        bw.close();
    }
}
