package baekjoon.silver.level2.test_11725.v2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 1; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        int[] parent = new int[N + 1];
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int child : tree.get(current)) {
                if (!visited[child]) {
                    visited[child] = true;
                    parent[child] = current;
                    queue.add(child);
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
}
