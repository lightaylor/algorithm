package gold.level5.test_1107.v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] broken = new boolean[10];

        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            broken[num] = true;
        }

        int min = Math.abs(N - 100);
        for (int i = 0; i < 1_000_000; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            boolean isValid = true;
            for (char c : arr) {
                if (broken[c - '0']) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                int number = arr.length + Math.abs(N - i);
                min = Math.min(min, number);
            }
        }

        System.out.print(min);
    }
}
