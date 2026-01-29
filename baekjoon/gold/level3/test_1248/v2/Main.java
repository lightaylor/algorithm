package baekjoon.gold.level3.test_1248.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static int[][] SIGNS;
    private static int[] ANSWER;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        SIGNS = new int[N][N];
        ANSWER = new int[N];

        int idx = 0;
        char[] input = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                char c = input[idx++];
                if (c != '0') {
                    SIGNS[i][j] = c == '+' ? 1 : -1;
                }
            }
        }

        recursion(0);

        StringBuilder sb = new StringBuilder();
        for (int i : ANSWER) {
            sb.append(i).append(" ");
        }
        System.out.print(sb.toString().trim());
    }

    private static boolean recursion(int idx) {
        if (idx == N) {
            return true;
        }

        for (int i = -10; i <= 10; i++) {
            ANSWER[idx] = i;
            if (checkSign(idx) && recursion(idx + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkSign(int idx) {

        for (int i = 0; i <= idx; i++) {
            int sum = 0;
            for (int j = i; j <= idx; j++) {
                sum += ANSWER[j];
                if ((SIGNS[i][j] == 0 && sum != 0) ||
                    (SIGNS[i][j] > 0 && sum <= 0) ||
                    (SIGNS[i][j] < 0 && sum >= 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}
