package programmers.dfs_bfs.network;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean[] visited;
    private List<Integer>[] graph;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int from = 0; from < n; from++) {
            for (int to = 0; to < n; to++) {
                if (from == to) continue;
                if (computers[from][to] == 0) continue;
                graph[from].add(to);
            }
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            answer++;
            dfs(i);
        }
        return answer;
    }

    private void dfs(int node) {
        visited[node] = true;
        for (int child : graph[node]) {
            if (!visited[child]) dfs(child);
        }
    }
}
