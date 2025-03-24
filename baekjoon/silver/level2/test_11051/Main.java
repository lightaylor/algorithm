package silver.level2.test_11051;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static long[] factorial;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        factorial = new long[n + 1];
        factorial[0] = 1 % 10_007;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factory(i);
        }

        BigInteger num = BigInteger.valueOf(factorial[n]);
        BigInteger den = BigInteger.valueOf((factorial[k] * factorial[n - k]));
        System.out.print(num.multiply(den.modInverse(BigInteger.valueOf(10_007)))
            .mod(BigInteger.valueOf(10_007)));
    }

    private static long factory(int n) {
        return factorial[n - 1] * n % 10_007;
    }
}
