package silver.level2.test_9184;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    static long[][][] dp = new long[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        dp[0][0][0] = 1;
        while (!input.equals("-1 -1 -1")) {
            int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];
            long result = w(a, b, c);

            bw.write(String.format("w(%d, %d, %d) = %d", arr[0],arr[1],arr[2], result));
            bw.newLine();
            input = br.readLine();
        }
        bw.close();
    }

    public static long w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        } else if (dp[a][b][c] > 0) {
            return dp[a][b][c];
        } else if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }
        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }
}
