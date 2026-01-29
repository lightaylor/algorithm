package baekjoon.gold.level3.test_1520;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] MAP;
    static int[][] DP;
    static int M, N;
    static int[] x = {0, 0, -1, 1};
    static int[] y = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        MAP = new int[M][N];
        DP = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                MAP[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) Arrays.fill(DP[i], -1);

        System.out.print(dfs(0, 0));
    }

    private static int dfs(int m, int n) {
        if (DP[m][n] != -1) return DP[m][n];
        if (m == M - 1 && n == N - 1) return 1;

        DP[m][n] = 0;
        int current = MAP[m][n];
        for (int i = 0; i < 4; i++) {
            int dx = x[i] + m;
            int dy = y[i] + n;
            if (dx < 0 || dy < 0 || dx >= M || dy >= N || current <= MAP[dx][dy]) continue;
            DP[m][n] += dfs(dx, dy);
        }
        return DP[m][n];
    }
}
