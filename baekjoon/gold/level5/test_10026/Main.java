package baekjoon.gold.level5.test_10026;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N;
    private static boolean[][] visited;
    private static char[][] colors;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        visited = new boolean[N][N];

        colors = new char[N][N];
        for (int i = 0; i < N; i++) {
            colors[i] = sc.nextLine().toCharArray();
        }

        int RGB = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j, false);
                    RGB++;
                }
            }
        }

        int RB = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j, true);
                    RB++;
                }
            }
        }

        System.out.print(RGB + " " + RB);
    }

    private static void bfs(int x, int y, boolean isColorBlind) {
        Queue<int[]> queue = new LinkedList<>();
        char color = colors[x][y];
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + temp[0];
                int ny = dy[i] + temp[1];

                if (0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny]) {
                    if (isColorBlind) {
                        if ((color == 'R' || color == 'G') && (colors[nx][ny] == 'R' || colors[nx][ny] == 'G')) {
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        } else if (color == 'B' && colors[nx][ny] == 'B') {

                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        }
                    } else if (color == colors[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
