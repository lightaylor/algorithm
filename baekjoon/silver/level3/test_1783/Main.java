package baekjoon.silver.level3.test_1783;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 1;
        if (n > 1) {
            if (n == 2) {
                answer = Math.min(4, (m + 1) / 2);
            } else {
                if (m < 7) answer = Math.min(4, m);
                else answer = m - 2;
            }
        }

        System.out.print(answer);
    }
}
