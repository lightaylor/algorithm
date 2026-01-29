package baekjoon.gold.level2.test_11444;

import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(fib(n));
    }

    public static int fib(long n) {
        if (n == 0) return 0;
        long[][] result = {{1, 0}, {0, 1}}, base = {{1, 1}, {1, 0}};

        for (; n > 0; n /= 2) {
            if (n % 2 == 1) result = multiply(result, base);
            base = multiply(base, base);
        }
        return (int) result[1][0];
    }

    private static long[][] multiply(long[][] a, long[][] b) {
        return new long[][]{
            {(a[0][0] * b[0][0] + a[0][1] * b[1][0]) % MOD,
                (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % MOD},
            {(a[1][0] * b[0][0] + a[1][1] * b[1][0]) % MOD,
                (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % MOD}
        };
    }
}
