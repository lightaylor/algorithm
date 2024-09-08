package gold5.test_2096;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            board[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] maxDp = new int[n + 1][3];
        int[][] minDp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            maxDp[i][0] = board[i][0] + Math.max(maxDp[i - 1][0], maxDp[i - 1][1]);
            maxDp[i][1] = board[i][1] + Math.max(maxDp[i - 1][0], Math.max(maxDp[i - 1][1], maxDp[i - 1][2]));
            maxDp[i][2] = board[i][2] + Math.max(maxDp[i - 1][1], maxDp[i - 1][2]);

            minDp[i][0] = board[i][0] + Math.min(minDp[i - 1][0], minDp[i - 1][1]);
            minDp[i][1] = board[i][1] + Math.min(minDp[i - 1][0], Math.min(minDp[i - 1][1], minDp[i - 1][2]));
            minDp[i][2] = board[i][2] + Math.min(minDp[i - 1][1], minDp[i - 1][2]);
        }

        int max = maxDp[n][0];
        int min = minDp[n][0];
        for (int i = 1; i < 3; i++) {
            max = Math.max(max, maxDp[n][i]);
            min = Math.min(min, minDp[n][i]);
        }

        bw.write(max + " " + min);
        bw.close();
    }
}
