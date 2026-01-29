package baekjoon.gold.level1.test_13460;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int N, M;
    private static char[][] board;
    private static boolean[][][][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        board = new char[N][M];
        visited = new boolean[N][M][N][M];
        int rx = 0, ry = 0, bx = 0, by = 0;
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                    board[i][j] = '.';
                } else if (board[i][j] == 'B') {
                    bx = i;
                    by = j;
                    board[i][j] = '.';
                }
            }
        }

        System.out.print(bfs(rx, ry, bx, by));
    }

    private static int bfs(int rx, int ry, int bx, int by) {
        Queue<State> q = new ArrayDeque<>();
        q.add(new State(rx, ry, bx, by, 0));

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.depth >= 10) continue;
            for (int d = 0; d < 4; d++) {
                MoveResult r = move(cur.rx, cur.ry, d);
                MoveResult b = move(cur.bx, cur.by, d);

                if (b.hole) continue;
                if (r.hole) return cur.depth + 1;

                if (r.x == b.x && r.y == b.y) {
                    if (r.dist > b.dist) {
                        r.x -= dx[d];
                        r.y -= dy[d];
                    } else {
                        b.x -= dx[d];
                        b.y -= dy[d];
                    }
                }

                if (!visited[r.x][r.y][b.x][b.y]) {
                    visited[r.x][r.y][b.x][b.y] = true;
                    q.add(new State(r.x, r.y, b.x, b.y, cur.depth + 1));
                }
            }
        }
        return -1;
    }

    private static MoveResult move(int x, int y, int d) {
        int nx = x;
        int ny = y;
        int dist = 0;

        while (true) {
            int tx = nx + dx[d];
            int ty = ny + dy[d];

            if (board[tx][ty] == '#') break;

            nx = tx;
            ny = ty;
            dist++;

            if (board[nx][ny] == 'O') {
                return new MoveResult(nx, ny, dist, true);
            }
        }
        return new MoveResult(nx, ny, dist, false);
    }

    static class State {
        int rx, ry, bx, by, depth;

        State(int rx, int ry, int bx, int by, int depth) {
            this.rx = rx;
            this.ry = ry;
            this.bx = bx;
            this.by = by;
            this.depth = depth;
        }
    }

    static class MoveResult {
        int x, y, dist;
        boolean hole;

        MoveResult(int x, int y, int dist, boolean hole) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.hole = hole;
        }
    }
}
