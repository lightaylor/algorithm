package baekjoon.gold.level4.test_14226.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        bfs(S);
    }

    private static void bfs(int S) {
        Queue<Status> queue = new LinkedList<>();
        queue.add(new Status(1, 0, 0));
        boolean[][] visited = new boolean[2001][2001];
        visited[1][0] = true;

        while (!queue.isEmpty()) {
            Status status = queue.poll();
            int screen = status.screen;
            int clipboard = status.clipboard;
            int sec = status.sec;

            if (screen == S) {
                System.out.print(sec);
                return;
            }

            if (screen - 1 >= 0 && !visited[screen - 1][clipboard]) {
                visited[screen - 1][clipboard] = true;
                queue.add(new Status(screen - 1, clipboard, sec + 1));
            }
            if (screen > 0 && !visited[screen][screen]) {
                visited[screen][screen] = true;
                queue.add(new Status(screen, screen, sec + 1));
            }
            if (screen + clipboard <= 1000 && !visited[screen + clipboard][clipboard]) {
                visited[screen + clipboard][clipboard] = true;
                queue.add(new Status(screen + clipboard, clipboard, sec + 1));
            }
        }
    }

    static class Status {
        int screen;
        int clipboard;
        int sec;

        public Status(int screen, int clipboard, int sec) {
            this.screen = screen;
            this.clipboard = clipboard;
            this.sec = sec;
        }
    }
}
