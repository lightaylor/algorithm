package baekjoon.silver.level4.test_9613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            long sum = 0;

            for (int j = 1; j < n; j++) {
                int b = sc.nextInt();
                arr[j] = b;
                for (int a = 0; a < j; a++) sum += gcd(arr[a], b);
            }
            System.out.println(sum);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
