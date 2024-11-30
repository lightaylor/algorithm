package gold.level4.test_1753;

import java.util.*;

public class Main {
    private static List<List<int[]>> graph;
    private static int[] score;
    private static int V;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        int E = sc.nextInt();
        int start = sc.nextInt();

        score = new int[V + 1];
        Arrays.fill(score, Integer.MAX_VALUE);
        score[start] = 0;

        graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new int[]{v, w}); // u에서 v로 가는 간선, 가중치 w
        }

        dijkstra(start);

        for (int i = 1; i <= V; i++) {
            if (score[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(score[i]);
            }
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            if (dist > score[node]) continue;

            for (int[] edge : graph.get(node)) {
                int next = edge[0];
                int weight = edge[1];
                int newDist = score[node] + weight;

                if (newDist < score[next]) {
                    score[next] = newDist;
                    pq.add(new int[]{next, newDist});
                }
            }
        }
    }
}
