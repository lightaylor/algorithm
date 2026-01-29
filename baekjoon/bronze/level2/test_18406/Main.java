package baekjoon.bronze.level2.test_18406;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.nextLine().toCharArray();

        int left = 0;
        int right = 0;
        for (int i = 0; i < n.length; i++) {
            if (i < n.length / 2) left += Character.getNumericValue(n[i]);
            else right += Character.getNumericValue(n[i]);
        }

        System.out.print(left == right ? "LUCKY" : "READY");
    }
}
