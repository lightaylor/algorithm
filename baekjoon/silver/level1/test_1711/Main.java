package baekjoon.silver.level1.test_1711;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        long count = 0;
        for (int i = 0; i < n; i++) {
            long[] c1 = arr[i];
            for (int j = i + 1; j < n; j++) {
                long[] c2 = arr[j];
                for (int k = j + 1; k < n; k++) {
                    long[] c3 = arr[k];

                    long a = (c1[0] - c2[0]) * (c1[0] - c2[0]) + (c1[1] - c2[1]) * (c1[1] - c2[1]);
                    long b = (c1[0] - c3[0]) * (c1[0] - c3[0]) + (c1[1] - c3[1]) * (c1[1] - c3[1]);
                    long c = (c3[0] - c2[0]) * (c3[0] - c2[0]) + (c3[1] - c2[1]) * (c3[1] - c2[1]);

                    if (a + b == c || b + c == a || a + c == b) count++;
                }
            }
        }

        System.out.print(count);
    }
}
