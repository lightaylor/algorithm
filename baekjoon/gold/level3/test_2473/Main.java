package gold.level3.test_2473;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] solutions = new long[n];
        for (int i = 0; i < n; i++) solutions[i] = sc.nextInt();
        Arrays.sort(solutions);

        long value = Long.MAX_VALUE;
        long a = 0, b = 0, c = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                long sum = solutions[i] + solutions[left] + solutions[right];
                if (Math.abs(sum) < value) {
                    value = Math.abs(sum);
                    a = solutions[i];
                    b = solutions[left];
                    c = solutions[right];
                }

                if (sum > 0) right--;
                else left++;
            }
        }

        System.out.printf("%d %d %d", a, Math.min(b, c), Math.max(b, c));
    }
}
