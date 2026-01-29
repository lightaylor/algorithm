package baekjoon.silver.level5.test_1417;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dasom = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 1; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int count = 0;
        while (!queue.isEmpty() && dasom <= queue.peek()) {
            int p = queue.poll();
            queue.add(p - 1);
            dasom++;
            count++;
        }

        System.out.print(count);
    }
}
