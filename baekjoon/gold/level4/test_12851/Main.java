package gold.level4.test_12851;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int answer;
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        answer = Integer.MAX_VALUE;
        count = 0;
        bfs(n, k);
        System.out.println(answer);
        System.out.println(count);
    }

    private static void bfs(int n, int k) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100_001];
        queue.add(new int[]{n, 0});

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            visited[location[0]] = true;

            if (location[0] == k) {
                if (location[1] < answer) {
                    answer = location[1];
                    count = 1;
                } else if (answer == location[1]) {
                    count++;
                }
            }

            if (location[0] * 2 <= 100_000 && !visited[location[0] * 2]) {
                queue.add(new int[]{2 * location[0], location[1] + 1});
            }
            if (location[0] - 1 >= 0 && !visited[location[0] - 1]) {
                queue.add(new int[]{location[0] - 1, location[1] + 1});
            }
            if (location[0] + 1 <= 100_000 && !visited[location[0] + 1]) {
                queue.add(new int[]{location[0] + 1, location[1] + 1});
            }
        }
    }
}
