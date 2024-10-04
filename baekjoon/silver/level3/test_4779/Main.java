package silver.level3.test_4779;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dp = new String[13];
        dp[0] = "-";

        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i-1] + " ".repeat((int) Math.pow(3, i - 1)) + dp[i-1];
        }

        String input = br.readLine();
        while (input != null) {
            bw.write(dp[Integer.parseInt(input)]);
            bw.newLine();
            input = br.readLine();
        }
        bw.close();
    }
}
