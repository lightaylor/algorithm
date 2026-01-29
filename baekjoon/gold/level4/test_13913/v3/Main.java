package baekjoon.gold.level4.test_13913.v3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        bfs();
    }

    private static void bfs() {
        int[] visited = new int[100_001];
        Arrays.fill(visited, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = -2;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == M) {
                StringBuilder sb = new StringBuilder();
                int temp = M;
                int count = 0;

                while (temp != -2) {
                    sb.insert(0, temp + " ");
                    temp = visited[temp];
                    count++;
                }
                System.out.println(count - 1);
                System.out.println(sb.toString().trim());
                return;
            }

            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                if (0 <= next && next <= 100_000 && visited[next] == -1) {
                    visited[next] = current;
                    queue.add(next);
                }
            }
        }
    }
}
