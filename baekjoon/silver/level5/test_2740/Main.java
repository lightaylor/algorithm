package baekjoon.silver.level5.test_2740;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = fillMatrix(sc);
        int[][] b = fillMatrix(sc);
        printMatrix(multiply(a, b));
    }

    private static int[][] fillMatrix(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] target = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                target[i][j] = sc.nextInt();
            }
        }
        return target;
    }

    private static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int p = B[0].length;
        int[][] C = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                for (int j = 0; j < p; j++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    private static void printMatrix(int[][] M) {
        StringBuilder sb = new StringBuilder();
        for (int[] m : M) {
            for (int j = 0; j < m.length; j++) {
                if (j > 0) sb.append(' ');
                sb.append(m[j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
