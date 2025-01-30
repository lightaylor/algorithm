package silver.level2.test_24479;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[] visited;
    private static List<Integer>[] graph;
    private static int index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        index = 1;
        visited = new int[n + 1];
        graph = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(visited[i]);
        }
    }

    private static void dfs(int start) {
        visited[start] = index++;

        for (int i : graph[start]) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }
}
