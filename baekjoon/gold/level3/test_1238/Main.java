package gold.level3.test_1238;

import java.util.Scanner;

public class Main {
    private static final int INF = 1000000000;
    private static int[][] map;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    map[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int time = sc.nextInt();
            map[start][end] = time;
        }

        floydWarshall();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (map[i][x] != INF && map[x][i] != INF) {
                answer = Math.max(map[i][x] + map[x][i], answer);
            }
        }
        System.out.print(answer);
    }

    private static void floydWarshall() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][k] != INF && map[k][j] != INF) {
                        map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                    }
                }
            }
        }
    }
}
