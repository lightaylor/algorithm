package gold.level4.test_14500.v3;

import java.util.Scanner;

public class Main {
    private static final int[][][] tetrinos = {
        new int[][]{{1, 0}, {2, 0}, {3, 0}},
        new int[][]{{0, 1}, {0, 2}, {0, 3}},
        new int[][]{{1, 0}, {0, 1}, {1, 1}},
        new int[][]{{0, 1}, {0, 2}, {1, 2}},
        new int[][]{{0, 1}, {0, 2}, {-1, 2}},
        new int[][]{{0, 1}, {1, 1}, {2, 1}},
        new int[][]{{0, 1}, {-1, 1}, {-2, 1}},
        new int[][]{{-1, 0}, {-1, 1}, {-1, 2}},
        new int[][]{{1, 0}, {1, 1}, {1, 2}},
        new int[][]{{1, 0}, {2, 0}, {2, 1}},
        new int[][]{{-1, 0}, {-2, 0}, {-2, 1}},
        new int[][]{{0, 1}, {-1, 1}, {-1, 2}},
        new int[][]{{0, 1}, {1, 1}, {1, 2}},
        new int[][]{{1, 0}, {1, 1}, {2, 1}},
        new int[][]{{1, 0}, {0, 1}, {-1, 1}},
        new int[][]{{-1, 1}, {0, 1}, {1, 1}},
        new int[][]{{1, 0}, {2, 0}, {1, 1}},
        new int[][]{{0, 1}, {0, 2}, {-1, 1}},
        new int[][]{{0, 1}, {0, 2}, {1, 1}},
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int[][] tetrino : tetrinos) {
                    int sum = map[i][j];
                    for (int k = 0; k < 3; k++) {
                        int x = tetrino[k][0] + i;
                        int y = tetrino[k][1] + j;

                        if (0 <= x && x < N && 0 <= y && y < M) {
                            sum += map[x][y];
                        } else {
                            sum = 0;
                            break;
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.print(max);
    }
}
