package gold4.test_14226;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] d = new int[n + 1][n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(0);

        while (!queue.isEmpty()) {
            int s = queue.remove();
            int c = queue.remove();
            if (d[s][s] == 0) {
                d[s][s] = d[s][c] + 1;
                queue.add(s);
                queue.add(s);
            }
            if (s + c <= n && d[s + c][c] == 0) {
                d[s + c][c] = d[s][c] + 1;
                queue.add(s + c);
                queue.add(c);
            }
            if (0 < s && d[s - 1][c] == 0) {
                d[s - 1][c] = d[s][c] + 1;
                queue.add(s - 1);
                queue.add(c);
            }
        }

        int answer = -1;
        for (int i = 0; i <= n; i++) {
            if (0 < d[n][i]) {
                if (d[n][i] < answer || answer == -1) {
                    answer = d[n][i];
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
