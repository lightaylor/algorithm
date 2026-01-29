package baekjoon.gold.level3.test_14391.v3;

import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;
    private static char[][] map;
    private static int maxSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        map = new char[N][M];
        maxSum = 0;

        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        for (int bit = 0; bit < (1 << (N * M)); bit++) {
            maxSum = Math.max(maxSum, getSum(bit));
        }
        System.out.print(maxSum);
    }

    private static int getSum(int bit) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int current = 0;
            for (int j = 0; j < M; j++) {
                int idx = i * M + j;
                if ((bit & (1 << idx)) != 0) {
                    current = current * 10 + (map[i][j] - '0');
                } else {
                    sum += current;
                    current = 0;
                }
            }
            sum += current;
        }

        for (int i = 0; i < M; i++) {
            int current = 0;
            for (int j = 0; j < N; j++) {
                int idx = j * M + i;
                if ((bit & (1 << idx)) == 0) {
                    current = current * 10 + (map[j][i] - '0');
                } else {
                    sum += current;
                    current = 0;
                }
            }
            sum += current;
        }

        return sum;
    }
}
