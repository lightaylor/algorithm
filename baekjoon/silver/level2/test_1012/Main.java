package silver.level2.test_1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static final Point[] points = {new Point(1, 0), new Point(-1, 0), new Point(0, 1), new Point(0, -1),};
    private static int M;
    private static int N;
    private static int[][] map;
    private static boolean[][] visited;
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();

            count = K;
            map = new int[M][N];
            for (int j = 0; j < K; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }

            visited = new boolean[M][N];
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        bfs(x, y);
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (Point point : points) {
                int nx = p.x + point.x;
                int ny = p.y + point.y;
                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new Point(nx, ny));
                        visited[nx][ny] = true;
                        count--;
                    }
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
