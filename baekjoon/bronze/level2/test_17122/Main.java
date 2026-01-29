package baekjoon.bronze.level2.test_17122;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] chess = {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1}
        };

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int a1 = arr[0].charAt(0) - 'A';
            int a2 = arr[0].charAt(1) - '1';

            int b = Integer.parseInt(arr[1]) - 1;
            int b1 = b / 8;
            int b2 = b % 8;

            if (chess[a1][a2] == chess[b1][b2]) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
            bw.newLine();
        }
        bw.close();
    }
}
