package gold.level4.test_9663;

import java.util.Scanner;

public class Main {

    private static int n;
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = 0;

        int[] queens = new int[n];

        dfs(0, queens);

        System.out.print(count);
    }

    private static void dfs(int row, int[] queens) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, queens)) {
                queens[row] = col;
                dfs(row + 1, queens);
            }
        }
    }

    private static boolean isSafe(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
