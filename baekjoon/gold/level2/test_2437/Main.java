package baekjoon.gold.level2.test_2437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        int answer = 1;
        for (int i = 1; i < 1_000_000_000; i++) {
            int sum = 0;

            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] + sum <= i) {
                    sum += arr[j];
                }

                if (i == sum) {
                    break;
                }
            }

            if (sum != i) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}
