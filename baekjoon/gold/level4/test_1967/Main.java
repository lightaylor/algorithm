package gold.level4.test_1967;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<List<Node>> tree;
    static boolean[] visited;
    static int maxDistance, farthestNode;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes

        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            tree.get(u).add(new Node(v, w));
            tree.get(v).add(new Node(u, w));
        }

        visited = new boolean[n + 1];
        maxDistance = 0;
        dfs(1, 0);

        visited = new boolean[n + 1];
        maxDistance = 0;
        dfs(farthestNode, 0);

        System.out.print(maxDistance);
    }

    static void dfs(int current, int distance) {
        visited[current] = true;

        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = current;
        }

        for (Node neighbor : tree.get(current)) {
            if (!visited[neighbor.vertex]) {
                dfs(neighbor.vertex, distance + neighbor.weight);
            }
        }
    }

    static class Node {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
