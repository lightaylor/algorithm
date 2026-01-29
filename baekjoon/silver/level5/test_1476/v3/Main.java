package baekjoon.silver.level5.test_1476.v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        if (E + S + M == 3) {
            System.out.print(1);
            return;
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (i % 15 == E - 1 && i % 28 == S - 1 && i % 19 == M - 1) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}
