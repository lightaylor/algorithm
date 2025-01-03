package gold.level3.test_2206;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;
    private static char[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        bfs(new Point(0, 0, 0, 1));
    }

    private static void bfs(Point point) {
        boolean[][][] visited = new boolean[n][m][2];
        visited[point.x][point.y][0] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int distance = p.distance + 1;
            int wall = p.wall;

            if (p.x == n - 1 && p.y == m - 1) {
                System.out.print(p.distance);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (0 <= x && x < n && 0 <= y && y < m && !visited[x][y][wall]) {
                    visited[x][y][wall] = true;
                    if (map[x][y] == '1' && p.wall > 0) {
                        continue;
                    }
                    queue.add(new Point(x, y, wall + map[x][y] - '0', distance));
                }
            }
        }
        System.out.print(-1);
    }
}

class Point {
    int x, y, wall, distance;

    public Point(int x, int y, int wall, int distance) {
        this.x = x;
        this.y = y;
        this.wall = wall;
        this.distance = distance;
    }
}
