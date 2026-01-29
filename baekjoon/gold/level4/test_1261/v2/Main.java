package baekjoon.gold.level4.test_1261.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static int[][] maze;
    private static int[][] distance;
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static final int MAX = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        distance = new int[M][N];
        maze = new int[M][N];
        for (int i = 0; i < M; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                maze[i][j] = ch[j] - '0';
                distance[i][j] = Integer.MAX_VALUE;
            }
        }

        System.out.print(bfs(N, M));
    }

    private static int bfs(int N, int M) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0});
        distance[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (maze[nx][ny] == 0 && distance[nx][ny] > distance[x][y]) {
                        distance[nx][ny] = distance[x][y];
                        deque.addFirst(new int[]{nx, ny});
                    }

                    if (maze[nx][ny] == 1 && distance[nx][ny] > distance[x][y] + 1) {
                        distance[nx][ny] = distance[x][y] + 1;
                        deque.addLast(new int[]{nx, ny});
                    }
                }
            }
        }
        return distance[M - 1][N - 1];
    }
}
