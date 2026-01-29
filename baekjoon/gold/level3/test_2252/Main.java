package baekjoon.gold.level3.test_2252;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) list.add(new ArrayList<>());

        int[] degree = new int[n + 1];
        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            degree[b]++;
            list.get(a).add(b);
        }

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (degree[i] == 0) {
                deque.add(i);
                sb.append(i).append(" ");
            }
        }

        while (!deque.isEmpty()) {
            int cur = deque.poll();
            for (int next : list.get(cur)) {
                if (--degree[next] == 0) {
                    deque.add(next);
                    sb.append(next).append(" ");
                }
            }
        }

        System.out.print(sb.toString().trim());
    }
}
