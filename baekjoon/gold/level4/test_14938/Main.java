package baekjoon.gold.level4.test_14938;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], Integer.MAX_VALUE);
            map[i][i] = 0;
        }

        int[] item = new int[n];
        for (int i = 0; i < n; i++) item[i] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            map[a][b] = Math.min(map[a][b], c);
            map[b][a] = Math.min(map[b][a], c);
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (map[i][k] == Integer.MAX_VALUE) continue;
                for (int j = 0; j < n; j++) {
                    if (map[k][j] == Integer.MAX_VALUE) continue;
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        int ans = 0;
        for (int s = 0; s < n; s++) {
            int sum = 0;
            for (int j = 0; j < n; j++) if (map[s][j] <= m) sum += item[j];
            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }
}

