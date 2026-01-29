package baekjoon.bronze.level2.test_11944;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int min = Math.min(n * String.valueOf(n).length(), m);

        StringBuilder sb = new StringBuilder();
        while (sb.length() < min) {
            sb.append(n);
        }

        System.out.print(sb.substring(0, min));
    }
}
