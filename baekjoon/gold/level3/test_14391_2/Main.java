package gold.level3.test_14391_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int M;
    private static boolean[] CHECK;
    private static int[][] DIGITS;
    private static int MAX;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        DIGITS = new int[N][M];
        MAX = 0;

        for (int i = 0; i < N; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                DIGITS[i][j] = ch[j] - '0';
            }
        }

        CHECK = new boolean[N * M];
        recursion(0);
        System.out.print(MAX);
    }

    private static void recursion(int idx) {
        if (idx == N * M) {
            checkMax();
            return;
        }

        recursion(idx + 1);
        CHECK[idx] = true;
        recursion(idx + 1);
        CHECK[idx] = false;
    }

    private static void checkMax() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < M; j++) {
                int idx = i * M + j;
                if (CHECK[idx]) {
                    rowSum = rowSum * 10 + DIGITS[i][j];
                } else {
                    sum += rowSum;
                    rowSum = 0;
                }
            }
            sum += rowSum;
        }

        for (int j = 0; j < M; j++) {
            int colSum = 0;
            for (int i = 0; i < N; i++) {
                int idx = i * M + j;
                if (!CHECK[idx]) {
                    colSum = colSum * 10 + DIGITS[i][j];
                } else {
                    sum += colSum;
                    colSum = 0;
                }
            }
            sum += colSum;
        }

        MAX = Math.max(MAX, sum);
    }
}
