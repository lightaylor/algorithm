package baekjoon.gold.level4.test_17144;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static private final int[] x = {0, 0, 1, -1};
    static private final int[] y = {1, -1, 0, 0};
    static private int r;
    static private int c;
    static private int[][] map;
    static private int upper = -1, lower = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int t = sc.nextInt();
        map = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                map[i][j] = sc.nextInt();

                if (map[i][0] == -1) {
                    if (upper == -1) upper = i;
                    else lower = i;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            cleanAir();
            rotateArray();
        }
        System.out.print(sumFineDust());
    }

    private static void cleanAir() {
        int[][] prev = new int[r][c];
        for (int i = 0; i < r; i++) prev[i] = Arrays.copyOf(map[i], c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (prev[i][j] <= 0) continue;
                int spread = prev[i][j] / 5;
                if (spread == 0) continue;

                for (int k = 0; k < 4; k++) {
                    int dx = i + x[k];
                    int dy = j + y[k];
                    if (!in(dx, dy) || prev[dx][dy] == -1) continue;
                    map[i][j] -= spread;
                    map[dx][dy] += spread;
                }
            }
        }
    }

    private static boolean in(int i, int j) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

    private static void rotateArray() {
        for (int i = upper - 1; i > 0; i--) map[i][0] = map[i - 1][0];
        for (int j = 0; j < c - 1; j++) map[0][j] = map[0][j + 1];
        for (int i = 0; i < upper; i++) map[i][c - 1] = map[i + 1][c - 1];
        for (int j = c - 1; j > 1; j--) map[upper][j] = map[upper][j - 1];
        map[upper][1] = 0;
        map[upper][0] = -1;

        for (int i = lower + 1; i < r - 1; i++) map[i][0] = map[i + 1][0];
        for (int j = 0; j < c - 1; j++) map[r - 1][j] = map[r - 1][j + 1];
        for (int i = r - 1; i > lower; i--) map[i][c - 1] = map[i - 1][c - 1];
        for (int j = c - 1; j > 1; j--) map[lower][j] = map[lower][j - 1];
        map[lower][1] = 0;
        map[lower][0] = -1;
    }


    private static int sumFineDust() {
        int sum = 0;

        for (int[] r : map) {
            for (int dust : r) {
                if (dust > -1) sum += dust;
            }
        }
        return sum;
    }
}
