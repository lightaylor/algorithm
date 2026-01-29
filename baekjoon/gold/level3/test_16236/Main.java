package baekjoon.gold.level3.test_16236;

import java.util.*;

public class Main {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    private static int[][] map;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Shark shark = null;
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    shark = new Shark(i, j);
                    map[i][j] = 0;
                }
            }
        }

        System.out.print(simulate(shark));
    }

    private static int simulate(Shark shark) {
        int time = 0;

        while (true) {
            int[] target = bfs(shark);
            if (target == null) break;

            shark.x = target[0];
            shark.y = target[1];
            time += target[2];
            shark.eaten++;
            map[shark.x][shark.y] = 0;
            shark.checkGrowth();
        }

        return time;
    }

    private static int[] bfs(Shark shark) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.offer(new int[]{shark.x, shark.y, 0});
        visited[shark.x][shark.y] = true;

        List<int[]> fishes = new ArrayList<>();
        int minDis = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            if (dist > minDis) break;

            if (map[x][y] > 0 && map[x][y] < shark.size) {
                fishes.add(new int[]{x, y, dist});
                minDis = dist;
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n && !visited[nx][ny] &&
                    map[nx][ny] <= shark.size) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }

        if (fishes.isEmpty()) return null;
        fishes.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return fishes.get(0);
    }
}

class Shark {
    int x, y, size, eaten;

    public Shark(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 2;
        this.eaten = 0;
    }

    public void checkGrowth() {
        if (this.size == this.eaten) {
            size++;
            eaten = 0;
        }
    }
}
