package gold.level5.test_15681;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Integer>[] graph;
    private static int[] subtreeSize;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int Q = sc.nextInt();

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        subtreeSize = new int[N + 1];
        visited = new boolean[N + 1];
        dfs(R);

        for (int i = 0; i < Q; i++) {
            System.out.println(subtreeSize[sc.nextInt()]);
        }
    }

    private static int dfs(int node) {
        visited[node] = true;
        subtreeSize[node] = 1;
        for (int child : graph[node]) {
            if (!visited[child]) {
                subtreeSize[node] += dfs(child);
            }
        }
        return subtreeSize[node];
    }
}
