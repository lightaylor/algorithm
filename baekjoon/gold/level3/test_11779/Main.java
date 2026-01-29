package baekjoon.gold.level3.test_11779;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Node>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();
            graph[from].add(new Node(to, cost));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] dist = new int[n + 1];
        int[] prev = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.cost > dist[current.city]) {
                continue;
            }

            for (Node next : graph[current.city]) {
                int newCost = dist[current.city] + next.cost;
                if (newCost < dist[next.city]) {
                    dist[next.city] = newCost;
                    prev[next.city] = current.city;
                    pq.add(new Node(next.city, newCost));
                }
            }
        }

        System.out.println(dist[end]);

        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println(path.size());

        StringBuilder sb = new StringBuilder();
        for (int city : path) {
            sb.append(city).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static class Node implements Comparable<Node> {
        int city, cost;

        public Node(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
}
