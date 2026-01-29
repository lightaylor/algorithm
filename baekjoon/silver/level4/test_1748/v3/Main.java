package baekjoon.silver.level4.test_1748.v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        int count = 1;
        for (int i = 1; i <= N; i *= 10) {
            int end = Math.min(i * 10 - 1, N);
            answer += (end - i + 1) * count++;
        }

        System.out.print(answer);
    }
}
