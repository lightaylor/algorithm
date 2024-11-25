package gold.level4.test_1253;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            int target = arr[i];

            while (left < right) {
                if (left == i) {
                    left++;
                    continue;
                }
                if (right == i) {
                    right--;
                    continue;
                }

                int sum = arr[left] + arr[right];
                if (sum == target) {
                    answer++;
                    break;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.print(answer);
    }
}
