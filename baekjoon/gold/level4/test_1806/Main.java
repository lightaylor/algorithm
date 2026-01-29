package baekjoon.gold.level4.test_1806;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        long sum = 0;

        while (true) {
            if (sum >= s) {
                answer = Math.min(answer, right - left);
                sum -= arr[left++];
            } else if (right == n) {
                break;
            } else {
                sum += arr[right++];
            }
        }

        System.out.print(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}
