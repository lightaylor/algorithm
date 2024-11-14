package gold.level2.test_1167.v2;

import java.util.*;

public class Main {
    private static List<List<Edge>> tree;
    private static boolean[] visited;
    private static int maxDistance;
    private static int farthestNode;

    private static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        tree = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            int from = scanner.nextInt();
            while (true) {
                int to = scanner.nextInt();
                if (to == -1) break;
                int weight = scanner.nextInt();
                tree.get(from).add(new Edge(to, weight));
            }
        }

        visited = new boolean[V + 1];
        maxDistance = 0;
        dfs(1, 0);

        visited = new boolean[V + 1];
        maxDistance = 0;
        dfs(farthestNode, 0);

        System.out.print(maxDistance);
    }

    static void dfs(int node, int distance) {
        visited[node] = true;
        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = node;
        }

        for (Edge edge : tree.get(node)) {
            if (!visited[edge.to]) {
                dfs(edge.to, distance + edge.weight);
            }
        }
    }
}
