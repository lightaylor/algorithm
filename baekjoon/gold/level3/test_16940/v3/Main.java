package baekjoon.gold.level3.test_16940.v3;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    private static List<Integer>[] graph;
    private static int[] order;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        order = new int[N + 1];
        graph = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        sc.nextLine();

        order = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.print(bfs(1, N) ? 1 : 0);
    }

    private static boolean bfs(int start, int N) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];

        queue.add(start);
        visited[start] = true;

        int[] position = new int[N + 1];
        for (int i = 0; i < N; i++) {
            position[order[i]] = i;
        }

        for (int i = 1; i <= N; i++) {
            graph[i].sort(Comparator.comparingInt(node -> position[node]));
        }

        int idx = 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int i : graph[current]) {
                if (!visited[i]) {
                    if (i != order[idx]) {
                        return false;
                    }
                    queue.add(i);
                    visited[i] = true;
                    idx++;
                }
            }
        }
        return true;
    }
}
