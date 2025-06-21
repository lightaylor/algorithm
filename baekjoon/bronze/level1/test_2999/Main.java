package bronze.level1.test_2999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        int C = arr.length;
        int R = 1;
        for (int i = 1; i <= C; i++) {
            if (C % i == 0 && C / i >= i) R = C / i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C / R; i++) {
            for (int j = 0; j < R; j++) {
                sb.append(arr[j * (C / R) + i]);
            }
        }

        System.out.print(sb);
    }
}
