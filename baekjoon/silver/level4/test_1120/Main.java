package baekjoon.silver.level4.test_1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        for (int i = 0; i <= b.length - a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                count += b[i + j] != a[j] ? 1 : 0;
            }
            min = Math.min(min, count);
        }
        System.out.print(min == Integer.MAX_VALUE ? 0 : min);
    }
}
