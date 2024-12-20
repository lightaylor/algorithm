package silver.level1.test_14940;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                map[i][j] = x;

                if (x == 2) {
                    queue.add(new Point(i, j, 0));
                    map[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + point.x;
                int y = dy[i] + point.y;

                if (0 <= x && x < n && 0 <= y && y < m) {
                    if (!visited[x][y] && map[x][y] != 0) {
                        visited[x][y] = true;
                        map[x][y] = point.distance + 1;
                        queue.add(new Point(x, y, map[x][y]));
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                if (map[i][j] > 0 && !visited[i][j]) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(map[i][j]).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }

    static class Point {
        int x;
        int y;
        int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
