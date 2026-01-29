package baekjoon.silver.level2.test_2607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String base = sc.nextLine();
        int[] alphabet = new int[26];
        for (char c : base.toCharArray()) alphabet[c - 'A']++;

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            String word = sc.nextLine();
            int[] temp = alphabet.clone();
            for (char c : word.toCharArray()) temp[c - 'A']--;

            int plus = 0, minus = 0;
            for (int j : temp) {
                if (j > 0) plus += j;
                else if (j < 0) minus += j;
            }

            if (plus < 2 && minus > -2) count++;
        }
        System.out.print(count);
    }
}
