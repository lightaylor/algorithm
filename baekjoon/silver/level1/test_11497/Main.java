package silver.level1.test_11497;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int max = 0;
            Arrays.sort(arr);

            int[] copyArr = new int[n];
            int index = 0;

            for (int j = 0; j < n; j += 2) copyArr[index++] = arr[j];
            index = n - 1;
            for (int j = 1; j < n; j += 2) copyArr[index--] = arr[j];
            for (int j = 1; j < n; j++) {
                max = Math.max(Math.abs(copyArr[j - 1] - copyArr[j]), max);
            }
            max = Math.max(Math.abs(copyArr[0] - copyArr[n - 1]), max);

            System.out.println(max);
        }
    }
}
