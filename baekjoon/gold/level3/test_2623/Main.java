package gold.level3.test_2623;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] degree = new int[N + 1];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int count = sc.nextInt();

            int u = sc.nextInt();
            for (int j = 1; j < count; j++) {
                int v = sc.nextInt();
                degree[v]++;
                graph.get(u).add(v);
                u = v;
            }
        }

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (degree[i] == 0) {
                deque.add(i);
            }
        }

        int processed = 0;
        while (!deque.isEmpty()) {
            int u = deque.poll();
            sb.append(u).append('\n');
            processed++;

            for (int v : graph.get(u)) {
                if (--degree[v] == 0) {
                    deque.add(v);
                }
            }
        }

        if (processed != N) {
            System.out.print(0);
        } else {
            System.out.println(sb.toString().trim());
        }
    }
}
