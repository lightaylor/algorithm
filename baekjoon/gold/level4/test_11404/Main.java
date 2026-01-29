package baekjoon.gold.level4.test_11404;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n + 1][n + 1];
        int maxValue = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = i == j ? 0 : maxValue;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            map[a][b] = Math.min(map[a][b], cost);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][k] != maxValue && map[k][j] != maxValue) {
                        map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.setLength(0);
            for (int j = 1; j <= n; j++) {
                sb.append(map[i][j] == maxValue ? 0 : map[i][j]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
