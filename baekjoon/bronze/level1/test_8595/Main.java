package baekjoon.bronze.level1.test_8595;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] arr = sc.nextLine().toCharArray();

        long sum = 0;
        boolean isNumber = false;
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                sb.append(c);
                isNumber = true;
            } else {
                if (isNumber) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                    isNumber = false;
                }
            }
        }

        if (isNumber) sum += Integer.parseInt(sb.toString());
        System.out.print(sum);
    }
}
