package baekjoon.bronze.level2.test_13458;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        long count = 0;
        for (long i : a) {
            count++;
            long sum = i - b;
            if (sum > 0) {
                count += sum % c > 0 ? Math.abs(sum / c + 1) : Math.abs(sum / c);
            }
        }

        System.out.print(count);
    }
}
