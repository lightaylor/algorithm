package baekjoon.gold.level3.test_1865;

import java.util.Scanner;

public class Main {
    private static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int w = sc.nextInt();

            int[][] map = getMap(n, m, sc);
            for (int j = 0; j < w; j++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                int t = sc.nextInt();
                map[a][b] = Math.min(map[a][b], -t);
            }

            for (int k = 0; k < n; k++) {
                for (int start = 0; start < n; start++) {
                    if (map[start][k] == INF) continue;
                    for (int end = 0; end < n; end++) {
                        if (map[k][end] == INF) continue;
                        map[start][end] = Math.min(map[start][end], map[start][k] + map[k][end]);
                    }
                }
            }

            String answer = "NO";
            for (int v = 0; v < n; v++) {
                if (map[v][v] < 0) {
                    answer = "YES";
                    break;
                }
            }

            System.out.println(answer);
        }
    }

    private static int[][] getMap(int n, int m, Scanner sc) {
        int[][] map = new int[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) map[a][b] = INF;
            map[a][a] = 0;
        }

        for (int j = 0; j < m; j++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int t = sc.nextInt();
            map[a][b] = Math.min(map[a][b], t);
            map[b][a] = Math.min(map[b][a], t);
        }
        return map;
    }
}
