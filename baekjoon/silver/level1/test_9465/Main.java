package silver.level1.test_9465;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static final int[][] arr = new int[2][];
    private static final int[][] dp = new int[2][100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr[0] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[1] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];

            for (int j = 1; j < m; j++) {
                dp[0][j] = Math.max(dp[0][j-1], dp[1][j-1] + arr[0][j]);
                dp[1][j] = Math.max(dp[1][j-1], dp[0][j-1] + arr[1][j]);
            }

            int max = Math.max(dp[0][m-1], dp[1][m-1]);

            bw.write(String.valueOf(max));
            bw.newLine();
        }
        bw.close();
    }
}