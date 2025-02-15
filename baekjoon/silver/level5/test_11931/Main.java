package silver.level5.test_11931;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[2_000_001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt() + 1_000_000;
            arr[num] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2_000_000; i >= 0; i--) {
            if (arr[i]) {
                sb.append(i - 1_000_000).append("\n");
            }
        }
        System.out.print(sb);
    }
}
