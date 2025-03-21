package gold.level4.test_16958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] cities = new int[n][3];

        for (int i = 0; i < n; i++) {
            cities[i][0] = sc.nextInt();
            cities[i][1] = sc.nextInt();
            cities[i][2] = sc.nextInt();
        }

        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int[] a = cities[i];
                int[] b = cities[j];
                dist[i][j] = Math.abs(a[1] - b[1]) + Math.abs(a[2] - b[2]);

                if (a[0] + b[0] == 2) {
                    dist[i][j] = Math.min(dist[i][j], t);
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(dist[sc.nextInt() - 1][sc.nextInt() - 1]);
        }
    }
}
