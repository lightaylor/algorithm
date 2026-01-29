package baekjoon.silver.level4.test_2847;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = arr.clone();
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            while (temp[i] >= temp[i + 1]) {
                temp[i + 1]++;
                count++;
            }
        }
        int answer = count;

        count = 0;
        temp = arr.clone();
        for (int i = 1; i < N; i++) {
            int idx = N - i;
            while (temp[idx] <= temp[idx - 1]) {
                temp[idx - 1]--;
                count++;
            }
        }
        
        System.out.print(Math.min(answer, count));
    }
}
