package baekjoon.gold.level3.test_9466;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            int[] indegree = new int[n + 1];

            for (int j = 1; j <= n; j++) {
                int v = sc.nextInt();
                arr[j] = v;
                indegree[v]++;
            }

            Deque<Integer> deque = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0) {
                    deque.add(i);
                }
            }

            while (!deque.isEmpty()) {
                int curr = deque.poll();
                if (--indegree[arr[curr]] == 0) {
                    deque.add(arr[curr]);
                }
            }

            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
