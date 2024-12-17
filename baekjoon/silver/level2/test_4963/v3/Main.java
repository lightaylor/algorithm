package silver.level2.test_4963.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int w;
    private static int h;
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        while (h + w > 0) {
            visited = new boolean[w][h];
            map = new int[w][h];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        bfs(new Point(i, j));
                        count++;
                    }
                }
            }
            System.out.println(count);
            h = sc.nextInt();
            w = sc.nextInt();
        }
    }

    private static void bfs(Point point) {
        int[] dx = new int[]{0, 0, 1, -1, -1, -1, 1, 1};
        int[] dy = new int[]{1, -1, 0, 0, -1, 1, -1, 1};

        visited[point.x][point.y] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 8; i++) {
                int x = dx[i] + current.x;
                int y = dy[i] + current.y;

                if (0 <= x && x < w && 0 <= y && y < h) {
                    if (!visited[x][y] && map[x][y] == 1) {
                        queue.add(new Point(x, y));
                    }
                    visited[x][y] = true;
                }
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
