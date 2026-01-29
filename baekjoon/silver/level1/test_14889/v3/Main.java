package baekjoon.silver.level1.test_14889.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int min;
    private static int[][] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        min = Integer.MAX_VALUE;
        visited = new boolean[N];

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);
        System.out.print(min);
    }

    private static void dfs(int idx, int start) {
        if (idx == N / 2) {
            int sum = getSumDiff();
            min = Math.min(min, sum);
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(idx + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    private static int getSumDiff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                for (int j = 0; j < N; j++) {
                    if (visited[j] && i != j) {
                        start += arr[i][j];
                    }
                }
            } else {
                for (int j = 0; j < N; j++) {
                    if (!visited[j] && i != j) {
                        link += arr[i][j];
                    }
                }
            }
        }
        return Math.abs(start - link);
    }
}
