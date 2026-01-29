package baekjoon.silver.level2.test_10971.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int[][] map;
    private static int min;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        visited = new boolean[N];
        min = Integer.MAX_VALUE;
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        visited[0] = true;
        dfs(0, 0, 1);
        System.out.print(min);
    }

    private static void dfs(int current, int sum, int count) {
        if (sum >= min) {
            return;
        }

        if (count == N) {
            if (map[current][0] != 0) {
                min = Math.min(min, sum + map[current][0]);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && map[current][i] != 0) {
                visited[i] = true;
                dfs(i, sum + map[current][i], count + 1);
                visited[i] = false;
            }
        }
    }
}
