package baekjoon.gold.level5.test_1916;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] graph = new int[n + 1][n + 1];

        for (int[] row : graph) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for (int i = 0; i < m; i++) {
            int[] temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[temp[0]][temp[1]] = Math.min(graph[temp[0]][temp[1]], temp[2]);
        }

        int[] str = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(dijkstra(n, graph, str[0], str[1])));
        bw.close();
    }

    private static int dijkstra(int n, int[][] graph, int start, int end) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n + 1];
        dist[start] = 0;

        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            if (dist[u] == Integer.MAX_VALUE) break;
            visited[u] = true;

            for (int j = 1; j <= n; j++) {
                if (graph[u][j] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {
                    dist[j] = dist[u] + graph[u][j];
                }
            }
        }

        return dist[end];
    }
}
