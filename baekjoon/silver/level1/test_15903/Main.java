package silver.level1.test_15903;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextLong());
        }

        for (int i = 0; i < m; i++) {
            long a = queue.poll();
            long b = queue.poll();
            long sum = a + b;
            queue.add(sum);
            queue.add(sum);
        }

        long total = 0;
        while (!queue.isEmpty()) {
            total += queue.poll();
        }

        System.out.print(total);
    }
}
