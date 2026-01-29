package baekjoon.silver.level3.test_1431;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }

            int sumA = digitSum(a);
            int sumB = digitSum(b);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return a.compareTo(b);
        });

        for (String str : arr) {
            System.out.println(str);
        }
    }

    private static int digitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}
