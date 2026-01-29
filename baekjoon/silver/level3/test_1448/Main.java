package baekjoon.silver.level3.test_1448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        long max = 0;
        for (int i = n - 1; i > 1; i--) {
            int a = arr[i];
            int b = arr[i - 1];
            int c = arr[i - 2];

            if (b + c > a) {
                max = a + b + c;
                break;
            }
        }

        System.out.print(max == 0 ? -1 : max);
    }
}
