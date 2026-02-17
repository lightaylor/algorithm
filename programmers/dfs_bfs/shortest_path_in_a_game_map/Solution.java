package programmers.dfs_bfs.shortest_path_in_a_game_map;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private final int[] dx = {1, -1, 0, 0};
    private final int[] dy = {0, 0, 1, -1};
    private int[][] maps;
    private boolean[][] visited;
    private int n, m;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        this.maps = maps;
        visited = new boolean[n][m];
        return bfs();
    }

    private int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == n - 1 && current[1] == m - 1) {
                return current[2];
            }

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || maps[nx][ny] == 0)
                    continue;
                queue.add(new int[]{nx, ny, current[2] + 1});
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
}
