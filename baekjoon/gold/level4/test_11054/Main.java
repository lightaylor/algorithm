package baekjoon.gold.level4.test_11054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int[] lds = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            lds[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[j] < arr[i] && lds[i] < lds[j] + 1) {
                    lds[i] = lds[j] + 1;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, lis[i] + lds[i] - 1);
        }
        System.out.print(answer);
    }
}
