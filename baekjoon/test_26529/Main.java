package baekjoon.test_26529;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dp = {0, 0, 1};
        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for(int i = 0; i <= 45; i++) {
            if(input.equals(String.valueOf(i))) {
                bw.write(dp[2] + "\n");
                input = br.readLine();
            }
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
        }
        bw.close();
    }
}
