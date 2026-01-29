package baekjoon.gold.level4.test_14502;

import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static int max;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        max = 0;
        arr = new int[n * m];
        for (int i = 0; i < n * m; i++) arr[i] = sc.nextInt();
        generateWallCombinations();
        System.out.print(max);
    }

    private static void generateWallCombinations() {
        for (int i = 0; i < n * m; i++) {
            if (arr[i] != 0) continue;
            arr[i] = 1;
            for (int j = i + 1; j < n * m; j++) {
                if (arr[j] != 0) continue;
                arr[j] = 1;
                for (int k = j + 1; k < n * m; k++) {
                    if (arr[k] != 0) continue;
                    arr[k] = 1;
                    dfs();
                    arr[k] = 0;
                }
                arr[j] = 0;
            }
            arr[i] = 0;
        }
    }

    private static void dfs() {
        int[] copied = arr.clone();
        for (int i = 0; i < n * m; i++) {
            if (copied[i] == 2) {
                spread(copied, i / m, i % m);
            }
        }

        int safe = 0;
        for (int val : copied) {
            if (val == 0) safe++;
        }
        max = Math.max(max, safe);
    }

    private static void spread(int[] map, int x, int y) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : dirs) {
            int nx = x + d[0];
            int ny = y + d[1];
            if (nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx * m + ny] == 0) {
                map[nx * m + ny] = 2;
                spread(map, nx, ny);
            }
        }
    }
}
