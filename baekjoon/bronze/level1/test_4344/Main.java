package baekjoon.bronze.level1.test_4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            float sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            float avg = sum / n;
            int count = 0;
            for (int j : arr) if (avg < j) count++;
            double percent = (double) count / n * 100;
            System.out.printf("%.3f%%\n", percent);
        }
    }
}
