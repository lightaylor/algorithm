package baekjoon.bronze.level2.test_11880;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long answer = Math.min(a * a + (b + c) * (b + c), (a + b) * (a + b) + c * c);
            answer = Math.min(answer, (a + c) * (a + c) + b * b);
            System.out.println(answer);
        }
    }
}
