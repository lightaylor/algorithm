package silver.level5.test_2822;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sorted = Arrays.stream(arr).sorted().toArray();
        boolean[] b = new boolean[8];
        int sum = 0;
        for (int i = 3; i < 8; i++) {
            sum += sorted[i];
            for (int j = 0; j < 8; j++) {
                if (sorted[i] == arr[j]) {
                    b[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (b[i]) {
                sb.append(i + 1).append(" ");
            }
        }
        System.out.println(sum);
        System.out.println(sb.toString().trim());
    }
}
