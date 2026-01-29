package baekjoon.silver.level1.test_1697.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;
    private static boolean[] visited;
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[100_001];
        visited[N] = true;
        bfs();
        System.out.print(answer);
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{N, 0});
        visited[N] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == M) {
                answer = current[1];
                return;
            }

            if (current[0] + 1 <= 100_000 && !visited[current[0] + 1]) {
                visited[current[0] + 1] = true;
                queue.add(new int[]{current[0] + 1, current[1] + 1});
            }
            if (current[0] - 1 >= 0 && !visited[current[0] - 1]) {
                visited[current[0] - 1] = true;
                queue.add(new int[]{current[0] - 1, current[1] + 1});
            }
            if (current[0] * 2 <= 100_000 && !visited[current[0] * 2]) {
                visited[current[0] * 2] = true;
                queue.add(new int[]{current[0] * 2, current[1] + 1});
            }
        }
    }
}
