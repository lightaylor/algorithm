package baekjoon.gold.level4.test_9019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(bfs(A, B));
        }
    }

    private static String bfs(int start, int end) {
        Queue<Word> queue = new LinkedList<>();
        queue.add(new Word(start, ""));
        boolean[] visited = new boolean[10_000];

        while (!queue.isEmpty()) {
            Word current = queue.poll();
            int number = current.number;
            String move = current.move;
            visited[number] = true;

            if (number == end) {
                return move;
            }

            int d = number * 2 % 10_000;
            if (!visited[d]) {
                visited[d] = true;
                queue.add(new Word(d, move + "D"));
            }

            int s = number == 0 ? 9999 : number - 1;
            if (!visited[s]) {
                visited[s] = true;
                queue.add(new Word(s, move + "S"));
            }

            int l = (number % 1_000) * 10 + number / 1_000;
            if (!visited[l]) {
                visited[l] = true;
                queue.add(new Word(l, move + "L"));
            }

            int r = number / 10 + (number % 10 * 1_000);
            if (!visited[r]) {
                visited[r] = true;
                queue.add(new Word(r, move + "R"));
            }
        }
        return "";
    }

    static class Word {
        int number;
        String move;

        public Word(int number, String move) {
            this.number = number;
            this.move = move;
        }
    }
}
