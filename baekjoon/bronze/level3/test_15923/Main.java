package baekjoon.bronze.level3.test_15923;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x0 = x1;
        int y0 = y1;
        for (int i = 1; i < n; i++) {
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            sum += Math.abs(x1 - x2) + Math.abs(y1 - y2);
            x1 = x2;
            y1 = y2;
        }

        sum += Math.abs(x1 - x0) + Math.abs(y1 - y0);
        System.out.print(sum);
    }
}
