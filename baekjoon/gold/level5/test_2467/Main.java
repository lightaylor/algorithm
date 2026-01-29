package baekjoon.gold.level5.test_2467;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];
        int left = 0;
        int right = N - 1;
        while (left < right) {
            int sum = arr[right] + arr[left];
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                answer[0] = left;
                answer[1] = right;
            }

            if (sum > 0) {
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
                left++;
            }
        }
        System.out.print(arr[answer[0]] + " " + arr[answer[1]]);
    }
}
