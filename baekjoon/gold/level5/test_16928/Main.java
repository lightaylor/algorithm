package baekjoon.gold.level5.test_16928;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int[] map;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[101];
        map = new int[101];
        for (int i = 1; i <= M + N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a] = b;
        }

        visited[1] = true;
        System.out.print(bfs());
    }

    private static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int i = 1; i <= 6; i++) {
                int next = current[0] + i;
                next = map[next] > 0 ? map[next] : next;

                if (next == 100) {
                    return current[1] + 1;
                }

                if (next <= 100 && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, current[1] + 1});
                }
            }
        }
        return -1;
    }
}
