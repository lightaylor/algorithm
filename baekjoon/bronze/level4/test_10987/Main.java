package baekjoon.bronze.level4.test_10987;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        char[] input = sc.nextLine().toCharArray();

        int count = 0;
        for (char c : input) {
            for (char a : aeiou) {
                if (c == a) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
