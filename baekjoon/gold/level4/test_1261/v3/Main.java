package baekjoon.gold.level4.test_1261.v3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static boolean[][] visited;
    private static char[][] map;
    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();

        visited = new boolean[N][M];
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        bfs();
    }

    private static void bfs() {
        Deque<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 0));
        visited[0][0] = true;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int count = point.count;

            if (point.x == N - 1 && point.y == M - 1) {
                System.out.print(count);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int x = point.x + dx[i];
                int y = point.y + dy[i];

                if (0 <= x && x < N && 0 <= y && y < M && !visited[x][y]) {

                    visited[x][y] = true;
                    if (map[x][y] != '1') {
                        queue.addFirst(new Point(x, y, count));
                    } else {
                        queue.addLast(new Point(x, y, count + 1));
                    }
                }
            }
        }
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
