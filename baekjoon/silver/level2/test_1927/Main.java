package baekjoon.silver.level2.test_1927;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                Integer first = queue.poll();
                System.out.println(first != null ? first : 0);
            } else {
                queue.add(x);
            }
        }
        sc.close();
    }
}
