package gold.level4.test_16929.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static char[][] board;
    private static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        boolean answer = false;
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            if (answer) {
                break;
            }

            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    if (bfs(new Point(i, j, -1, -1), board[i][j], N, M)) {
                        answer = true;
                        break;
                    }
                }
            }
        }
        System.out.print(answer ? "Yes" : "No");
    }

    private static boolean bfs(Point p, char type, int N, int M) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(p);

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + point.x;
                int y = dy[i] + point.y;

                if (0 <= x && x < N && 0 <= y && y < M && board[x][y] == type) {
                    if (x == point.prevX && y == point.prevY) {
                        continue;
                    }
                    if (visited[x][y]) {
                        return true;
                    }
                    visited[x][y] = true;
                    queue.add(new Point(x, y, point.x, point.y));

                }
            }
        }

        return false;
    }

    static class Point {
        int x;
        int y;
        int prevX;
        int prevY;

        public Point(int x, int y, int prevX, int prevY) {
            this.x = x;
            this.y = y;
            this.prevX = prevX;
            this.prevY = prevY;
        }
    }
}
