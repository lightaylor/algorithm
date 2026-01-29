package baekjoon.silver.level2.test_30804;

import java.util.Scanner;

public class Main {

    private static int[] fruit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fruit = new int[10];
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int distinctFruits = 0;

        while (right < N) {
            if (fruit[arr[right]] == 0) {
                distinctFruits++;
            }
            fruit[arr[right]]++;
            right++;

            while (distinctFruits > 2) {
                fruit[arr[left]]--;
                if (fruit[arr[left]] == 0) {
                    distinctFruits--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
        }
        System.out.print(maxLength);
    }
}
