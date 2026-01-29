package baekjoon.gold.level5.test_1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long d = y - x;

            long k = (long) Math.sqrt(d);
            if (d == k*k) System.out.println(2*k - 1);
            else if (d <= k*k + k) System.out.println(2*k);
            else System.out.println(2*k + 1);
        }
    }
}
