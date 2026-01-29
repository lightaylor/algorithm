package baekjoon.silver.level3.test_2075;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pq.add(sc.nextInt());
                if (pq.size() > N) {
                    pq.poll();
                }
            }
        }

        System.out.print(pq.peek());
    }
}
