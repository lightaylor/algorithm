package baekjoon.silver.level4.test_1940;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        int left = 0;
        int right = N - 1;
        int answer = 0;
        while (left < right) {
            if (num[left] + num[right] == M) {
                answer++;
                left++;
                right--;
            }

            if (num[left] + num[right] > M) {
                right--;
            } else if (num[left] + num[right] < M) {
                left++;
            }
        }
        System.out.print(answer);
    }
}
