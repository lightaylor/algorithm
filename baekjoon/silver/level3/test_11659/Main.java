package silver.level3.test_11659;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[nm[0] + 1];
        dp[1] = arr[0];

        for (int i = 2; i <= nm[0]; i ++) {
            dp[i] = dp[i - 1] + arr[i - 1];
        }

        for (int i = 0; i < nm[1]; i ++) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = dp[input[1]] - dp[input[0] - 1];
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        bw.close();
    }
}
