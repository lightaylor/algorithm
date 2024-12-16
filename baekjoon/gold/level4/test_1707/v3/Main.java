package gold.level4.test_1707.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List[] graph;
    private static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            graph = new List[V + 1];
            visited = new int[V + 1];
            for (int j = 1; j <= V; j++) {
                graph[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                graph[a].add(b);
                graph[b].add(a);
            }

            boolean answer = true;
            for (int j = 1; j <= V; j++) {
                if (visited[j] == 0 && !dfs(j, 1)) {
                    answer = false;
                    break;
                }
            }
            System.out.println(answer ? "YES" : "NO");
        }
    }

    private static boolean dfs(int start, int idx) {
        visited[start] = idx;

        for (int i : (List<Integer>) graph[start]) {
            if (visited[i] == 0) {
                if (!dfs(i, 3 - idx)) {
                    return false;
                }
            } else if (visited[i] == visited[start]) {
                return false;
            }
        }
        return true;
    }
}
