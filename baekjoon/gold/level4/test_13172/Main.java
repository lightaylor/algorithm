package gold.level4.test_13172;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        BigInteger mod = new BigInteger("1000000007");

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < m; i++) {
            BigInteger n = new BigInteger(String.valueOf(sc.nextInt()));
            BigInteger s = new BigInteger(String.valueOf(sc.nextInt()));
            
            sum = sum.add(s.multiply(n.modPow(mod.subtract(BigInteger.valueOf(2)), mod)).mod(mod)).mod(mod);
        }

        System.out.print(sum);
    }
}
