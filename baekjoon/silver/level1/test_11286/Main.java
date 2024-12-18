package silver.level1.test_11286;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> plusQueue = new PriorityQueue<>();
        Queue<Integer> minusQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x != 0) {
                if (x < 0) {
                    minusQueue.add(x);
                } else {
                    plusQueue.add(x);
                }
            } else {
                if (plusQueue.isEmpty() && minusQueue.isEmpty()) {
                    System.out.println(0);
                } else if (minusQueue.isEmpty()) {
                    System.out.println(plusQueue.poll());
                } else if (plusQueue.isEmpty()){
                    System.out.println(minusQueue.poll());
                } else if (plusQueue.peek() < Math.abs(minusQueue.peek())) {
                    System.out.println(plusQueue.poll());
                } else {
                    System.out.println(minusQueue.poll());
                }
            }
        }
    }
}
