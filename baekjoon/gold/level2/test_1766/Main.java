package gold.level2.test_1766;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        int[] degree = new int[N + 1];
        for (int i = 0; i <= N; i++) list.add(new ArrayList<>());
        for (int i = 1; i <= M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.get(a).add(b);
            degree[b]++;
        }

        PriorityQueue<Integer> deque = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (degree[i] == 0) {
                deque.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            int current = deque.poll();
            sb.append(current).append(" ");
            for (int i : list.get(current)) {
                if (--degree[i] == 0) {
                    deque.add(i);
                }
            }
        }
        System.out.print(sb.toString().trim());
    }
}
