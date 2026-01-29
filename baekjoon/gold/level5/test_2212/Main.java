package baekjoon.gold.level5.test_2212;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] sensors = new int[N];
        for (int i = 0; i < N; i++) {
            sensors[i] = sc.nextInt();
        }

        sort(sensors);
        int[] differences = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            differences[i] = sensors[i + 1] - sensors[i];
        }

        sort(differences);
        int sum = 0;
        for (int i = 0; i < N - K; i++) {
            sum += differences[i];
        }

        System.out.print(sum);
        sc.close();
    }
}
