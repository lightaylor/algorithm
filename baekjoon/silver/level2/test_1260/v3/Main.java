package silver.level2.test_1260.v3;

import java.util.*;

public class Main {

    private static List<Integer>[] list;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        list = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        visited = new boolean[N + 1];
        System.out.println(dfs(V, new StringBuilder()).trim());
        visited = new boolean[N + 1];
        System.out.println(bfs(V));
    }

    private static String dfs(int start, StringBuilder sb) {
        visited[start] = true;
        sb.append(start).append(" ");
        Collections.sort(list[start]);

        for (int i : list[start]) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, sb);
            }
        }
        return sb.toString();
    }

    private static String bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");
            for (int i : list[current]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return sb.toString().trim();
    }
}
