package silver.level3.test_10972.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        String[] input = sc.nextLine().split(" ");
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (nextPermutation()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        } else {
            System.out.println(-1);
        }
    }

    private static boolean nextPermutation() {
        int i = N - 2;
        while (i >= 0 && arr[i] > arr[i + 1]) {
            i--;
        }

        if (i == -1) {
            return false;
        }

        int j = N - 1;
        while (arr[i] >= arr[j]) {
            j--;
        }

        swap(i, j);
        reverse(i + 1, N - 1);
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
