package silver.level1.test_11660;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int m = arr[1];
        
        int[][] table = new int[n][n];
        int[][] prefixSum = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            table[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = table[i - 1][j - 1]
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            int[] temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = temp[0];
            int y1 = temp[1];
            int x2 = temp[2];
            int y2 = temp[3];

            int answer = prefixSum[x2][y2]
                    - prefixSum[x1 - 1][y2]
                    - prefixSum[x2][y1 - 1]
                    + prefixSum[x1 - 1][y1 - 1];

            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        bw.close();
    }
}
