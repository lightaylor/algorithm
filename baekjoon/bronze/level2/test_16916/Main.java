package baekjoon.bronze.level2.test_16916;

import java.util.Scanner;

public class Main {

    public static int[] getPi(char[] pattern) {
        int[] pi = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; i++) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = pi[j - 1];
            }
            if (pattern[i] == pattern[j]) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    public static boolean kmp(char[] text, char[] pattern) {
        int[] pi = getPi(pattern);
        int j = 0;
        for (int i = 0; i < text.length; i++) {
            while (j > 0 && text[i] != pattern[j]) {
                j = pi[j - 1];
            }
            if (text[i] == pattern[j]) {
                if (j == pattern.length - 1) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char[] txt = sc.nextLine().toCharArray();

        System.out.println(kmp(str, txt) ? 1 : 0);
    }
}
