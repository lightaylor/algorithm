package gold.level2.test_9527;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.print(countOnesUpTo(B) - countOnesUpTo(A - 1));
    }

    private static long countOnesUpTo(long n) {
        long answer = 0;

        for (int i = 0; (1L << i) <= n; i++) {
            long bit = 1L << i;
            long period = 1L << (i + 1);

            long cycle = (n + 1) / period;
            long remainder = (n + 1) % period;

            answer += cycle * bit;
            answer += Math.max(0, remainder - bit);
        }

        return answer;
    }
}
