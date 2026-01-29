package baekjoon.silver.level1.test_7562.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int l = sc.nextInt();
            Point start = new Point(sc.nextInt(), sc.nextInt(), 0);
            Point end = new Point(sc.nextInt(), sc.nextInt(), 0);

            System.out.println(bfs(start, end, l));
        }
    }

    private static int bfs(Point start, Point end, int l) {
        int[] dx = {-1, -2, 1, 2, -1, -2, 2, 1};
        int[] dy = {-2, -1, -2, -1, 2, 1, 1, 2};

        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[l][l];
        visited[start.x][start.y] = true;

        queue.add(start);
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if (point.x == end.x && point.y == end.y) {
                return point.count;
            }

            for (int i = 0; i < 8; i++) {
                int x = dx[i] + point.x;
                int y = dy[i] + point.y;

                if (0 <= x && x < l && 0 <= y && y < l) {
                    if (!visited[x][y]) {
                        queue.add(new Point(x, y, point.count + 1));
                        visited[x][y] = true;
                    }
                }
            }
        }
        return 0;
    }

    static class Point {
        int x;
        int y;
        int count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
