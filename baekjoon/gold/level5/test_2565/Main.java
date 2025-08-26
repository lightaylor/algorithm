package gold.level5.test_2565;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int len = 0;
        int[] lis = new int[n];
        Arrays.sort(arr, Comparator.comparingInt(x -> x[0]));
        for (int i = 0; i < n; i++) {
            int b = arr[i][1];
            int pos = Arrays.binarySearch(lis, 0, len, b);
            if (pos < 0) pos = -(pos + 1);
            lis[pos] = b;
            if (pos == len) len++;
        }

        System.out.print(n - len);
    }
}
