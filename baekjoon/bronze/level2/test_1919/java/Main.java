package baekjoon.bronze.level2.test_1919.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        int[] aAlphabet = new int[26];
        int[] bAlphabet = new int[26];

        for (char c : a) {
            aAlphabet[c - 'a']++;
        }

        for (char c : b) {
            bAlphabet[c - 'a']++;
        }

        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (aAlphabet[i] != bAlphabet[i]) {
                sum += Math.abs(aAlphabet[i] - bAlphabet[i]);
            }
        }

        System.out.print(sum);
    }
}
