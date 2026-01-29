package baekjoon.bronze.level2.test_10820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            char[] arr = sc.nextLine().toCharArray();

            int numericCount = 0;
            int uppercaseCount = 0;
            int lowercaseCount = 0;
            int spaceCount = 0;
            for (char c : arr) {
                if (c == 32) {
                    spaceCount++;
                } else if (65 <= c && c <= 90) {
                    uppercaseCount++;
                } else if (97 <= c && c <= 122) {
                    lowercaseCount++;
                } else {
                    numericCount++;
                }
            }

            System.out.printf("%s %s %s %s%n", lowercaseCount, uppercaseCount, numericCount, spaceCount);
        }
    }
}
