package programmers.brute_force_search.splitting_the_power_grid_into_two_networks;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer>[] graph;
    boolean[] visited;

    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] w : wires) {
            graph[w[0]].add(w[1]);
            graph[w[1]].add(w[0]);
        }
        int answer = Integer.MAX_VALUE;

        for (int[] w : wires) {
            visited = new boolean[n + 1];
            int cnt = dfs(w[0], w[0], w[1]);
            answer = Math.min(answer, Math.abs(n - 2 * cnt));
        }

        return answer;
    }

    private int dfs(int cur, int a, int b) {
        visited[cur] = true;
        int count = 1;

        for (int next : graph[cur]) {
            if ((cur == a && next == b) || (cur == b && next == a)) continue;
            if (!visited[next]) {
                count += dfs(next, a, b);
            }
        }
        return count;
    }
}
