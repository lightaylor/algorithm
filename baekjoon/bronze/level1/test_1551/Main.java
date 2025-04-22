package bronze.level1.test_1551;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                arr[j] = arr[j + 1] - arr[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - k; i++) sb.append(arr[i]).append(",");
        System.out.print(sb.delete(sb.length() - 1, sb.length()));
    }
}
