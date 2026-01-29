package baekjoon.gold.level5.test_2470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(input[i]);
        }

        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;
        double min = Math.abs(arr[left] + arr[right]);
        int[] answer = {left, right};
        while (left < right) {
            double sum = arr[left] + arr[right];
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                answer[0] = left;
                answer[1] = right;
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.printf("%.0f %.0f", arr[answer[0]], arr[answer[1]]);
    }
}
