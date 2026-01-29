package baekjoon.silver.level2.test_11279;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println(queue.isEmpty() ? 0 : queue.poll());
            } else {
                queue.add(x);
            }
        }
    }
}
