package silver.level3.test_10973.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isValid = prevPermutation();

        StringBuilder sb = new StringBuilder();
        if (isValid) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.print(sb.toString().trim());
        } else {
            System.out.print(-1);
        }
    }

    private static boolean prevPermutation() {
        int left = -1;

        for (int i = N - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                left = i - 1;
                break;
            }
        }

        if (left == -1) {
            return false;
        }

        int right = N - 1;
        while (arr[left] < arr[right]) {
            right--;
        }
        swap(left, right);
        reverse(left + 1, N - 1);
        return true;
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int start, int end) {
        while (start < end) {
            swap(start, end);
            start++;
            end--;
        }
    }
}
