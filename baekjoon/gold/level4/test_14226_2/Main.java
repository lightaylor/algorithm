package gold.level4.test_14226_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final int MAX = 2_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());

        System.out.print(bfs(S));
    }

    private static int bfs(int S) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[MAX + 1][MAX + 1];

        queue.add(new int[]{1, 0, 0});
        visited[1][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int screen = current[0];
            int clipboard = current[1];
            int time = current[2];

            if (screen == S) {
                return time;
            }

            if (!visited[screen][screen]) {
                visited[screen][screen] = true;
                queue.add(new int[]{screen, screen, time + 1});
            }

            if (clipboard > 0 && screen + clipboard <= MAX && !visited[screen + clipboard][clipboard]) {
                visited[screen + clipboard][clipboard] = true;
                queue.add(new int[]{screen + clipboard, clipboard, time + 1});
            }

            if (screen - 1 >= 0 && !visited[screen - 1][clipboard]) {
                visited[screen - 1][clipboard] = true;
                queue.add(new int[]{screen - 1, clipboard, time + 1});
            }
        }

        return -1;
    }
}
