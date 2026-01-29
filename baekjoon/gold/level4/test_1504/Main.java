package baekjoon.gold.level4.test_1504;

import java.util.*;

public class Main {

    private static List<List<Node>> tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();

        tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            tree.get(a).add(new Node(b, c));
            tree.get(b).add(new Node(a, c));
        }

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int d1 = dijkstra(1, v1);
        int d2 = dijkstra(v1, v2);
        int d3 = dijkstra(v2, N);
        int path1 = (d1 == Integer.MAX_VALUE || d2 == Integer.MAX_VALUE || d3 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : d1 + d2 + d3;

        int d4 = dijkstra(1, v2);
        int d5 = dijkstra(v2, v1);
        int d6 = dijkstra(v1, N);
        int path2 = (d4 == Integer.MAX_VALUE || d5 == Integer.MAX_VALUE || d6 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : d4 + d5 + d6;

        int result = Math.min(path1, path2);
        System.out.print(result == Integer.MAX_VALUE ? -1 : result);
    }

    private static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));
        int[] distance = new int[tree.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentVertex = current.vertex;
            int currentWeight = current.weight;

            if (currentWeight > distance[currentVertex]) continue;

            for (Node neighbor : tree.get(currentVertex)) {
                int nextVertex = neighbor.vertex;
                int newWeight = currentWeight + neighbor.weight;

                if (newWeight < distance[nextVertex]) {
                    distance[nextVertex] = newWeight;
                    pq.offer(new Node(nextVertex, newWeight));
                }
            }
        }

        return distance[end];
    }

    static class Node {
        int vertex, weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

}
