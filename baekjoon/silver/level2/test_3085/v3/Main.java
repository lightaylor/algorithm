package silver.level2.test_3085.v3;

import java.util.Scanner;

public class Main {

    private static char[][] candies;
    private static int maxCandy;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        maxCandy = 0;

        candies = new char[N][N];
        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < N; j++) {
                candies[i][j] = row.charAt(j);
            }
        }

        checkMax();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (candies[i][j + 1] != candies[i][j]) {
                    swap(i, j, i, j + 1);
                    checkMax();
                    swap(i, j, i, j + 1);
                }
            }

            for (int j = 0; j < N - 1; j++) {
                if (candies[j + 1][i] != candies[j][i]) {
                    swap(j, i, j + 1, i);
                    checkMax();
                    swap(j, i, j + 1, i);
                }
            }
        }

        System.out.print(maxCandy);
    }

    private static void swap(int x1, int y1, int x2, int y2) {
        char temp = candies[x1][y1];
        candies[x1][y1] = candies[x2][y2];
        candies[x2][y2] = temp;
    }

    private static void checkMax() {
        for (int i = 0; i < N; i++) {
            int sum = 1;
            for (int j = 1; j < N; j++) {
                if (candies[i][j - 1] == candies[i][j]) {
                    sum++;
                } else {
                    maxCandy = Math.max(maxCandy, sum);
                    sum = 1;
                }
            }
            maxCandy = Math.max(maxCandy, sum);

            sum = 1;
            for (int j = 1; j < N; j++) {
                if (candies[j - 1][i] == candies[j][i]) {
                    sum++;
                } else {
                    maxCandy = Math.max(maxCandy, sum);
                    sum = 1;
                }
            }
            maxCandy = Math.max(maxCandy, sum);
        }
    }
}
