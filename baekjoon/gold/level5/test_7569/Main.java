package gold.level5.test_7569;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int[][][] boxes;
    private static boolean[][][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();

        Queue<Point> queue = new LinkedList<>();
        visited = new boolean[H][N][M];
        boxes = new int[H][N][M];
        for (int z = 0; z < H; z++) {
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    int i = sc.nextInt();
                    boxes[z][x][y] = i;
                    if (i == 1) {
                        visited[z][x][y] = true;
                        queue.add(new Point(z, x, y, 0));
                    }
                }
            }
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int[] dz = {-1, 1};
        int answer = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            int z = point.z;
            int count = point.count;

            for (int i = 0; i < 2; i++) {
                int nz = z + dz[i];

                if (0 <= nz && nz < H && !visited[nz][x][y] && boxes[nz][x][y] == 0) {
                    visited[nz][x][y] = true;
                    queue.add(new Point(nz, x, y, count + 1));
                    boxes[nz][x][y] = 1;
                }
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M && !visited[z][nx][ny] && boxes[z][nx][ny] == 0) {
                    visited[z][nx][ny] = true;
                    queue.add(new Point(z, nx, ny, count + 1));
                    boxes[z][nx][ny] = 1;
                }
            }

            answer = point.count;
        }

        for (int z = 0; z < H; z++) {
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (boxes[z][x][y] == 0) {
                        answer = -1;
                        break;
                    }
                }
            }
        }

        System.out.print(answer);
    }

    static class Point {
        int z;
        int x;
        int y;
        int count;

        public Point(int z, int x, int y, int count) {
            this.z = z;
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
