package baekjoon.silver.level2.test_21736;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static char[][] map;
    private static int count;
    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        count = 0;
        map = new char[N][M];
        Point point = null;
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'I') {
                    point = new Point(i, j);
                }
            }
        }

        bfs(point);
        System.out.print(count > 0 ? count : "TT");
    }

    private static void bfs(Point point) {
        boolean[][] visited = new boolean[N][M];
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);
        visited[point.x][point.y] = true;
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + current.x;
                int y = dy[i] + current.y;

                if (0 <= x && x < N && 0 <= y && y < M && map[x][y] != 'X' && !visited[x][y]) {
                    visited[x][y] = true;
                    count += map[x][y] == 'P' ? 1 : 0;
                    queue.add(new Point(x, y));
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
