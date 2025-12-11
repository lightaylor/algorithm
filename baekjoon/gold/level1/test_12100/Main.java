package gold.level1.test_12100;

import java.util.Scanner;

public class Main {
    private static int[][] board;
    private static int n;
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        answer = 0;
        bfs(board, 0);
        System.out.print(answer);
    }

    private static void bfs(int[][] board, int depth) {
        if (depth == 5) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    answer = Math.max(answer, board[i][j]);
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int[][] nextBoard = move(board, i);
            bfs(nextBoard, depth + 1);
        }
    }

    private static int[][] move(int[][] board, int dir) {
        int[][] tempBoard = copy(board);

        for (int i = 0; i < dir; i++) tempBoard = rotate(tempBoard);

        for (int col = 0; col < n; col++) {
            int[] line = new int[n];
            int idx = 0;

            for (int row = 0; row < n; row++) {
                if (tempBoard[row][col] != 0) line[idx++] = tempBoard[row][col];
            }

            for (int row = 0; row < n - 1; row++) {
                if (line[row] == line[row + 1] && line[row] != 0) {
                    line[row] *= 2;
                    line[row + 1] = 0;
                }
            }

            int[] finalLine = new int[n];
            int p = 0;
            for (int row = 0; row < n; row++) {
                if (line[row] != 0) finalLine[p++] = line[row];
            }

            for (int row = 0; row < n; row++) {
                tempBoard[row][col] = finalLine[row];
            }
        }

        if (dir > 0) {
            for (int i = 0; i < 4 - dir; i++) tempBoard = rotate(tempBoard);
        }

        return tempBoard;
    }

    private static int[][] rotate(int[][] board) {
        int[][] temp = copy(board);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = board[i][j];
            }
        }
        return temp;
    }

    static int[][] copy(int[][] a) {
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) b[i] = a[i].clone();
        return b;
    }
}
