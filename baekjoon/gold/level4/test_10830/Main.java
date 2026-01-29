package baekjoon.gold.level4.test_10830;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static int[][] matrix;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BigInteger b = sc.nextBigInteger();

        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] answer = matrixPower(b);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(answer[i][j] % 1000).append(" ");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static int[][] matrixPower(BigInteger b) {
        int[][] result = new int[n][n];
        int[][] base = matrix.clone();

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                result = multiply(result, base);
            }
            base = multiply(base, base);
            b = b.divide(BigInteger.TWO);
        }

        return result;
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    temp[i][j] += a[i][k] * b[k][j] % 1000;
                }
            }
        }
        return temp;
    }
}
