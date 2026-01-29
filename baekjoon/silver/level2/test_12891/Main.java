package baekjoon.silver.level2.test_12891;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        String dna = sc.next();

        int[] required = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.print(countValidPasswords(dna, S, P, required));
    }

    private static int countValidPasswords(String dna, int S, int P, int[] required) {
        int[] current = new int[4];
        int count = 0;

        for (int i = 0; i < P; i++) addChar(dna.charAt(i), current);
        if (isValid(current, required)) count++;
        for (int i = P; i < S; i++) {
            removeChar(dna.charAt(i - P), current);
            addChar(dna.charAt(i), current);
            if (isValid(current, required)) count++;
        }

        return count;
    }

    private static void addChar(char c, int[] count) {
        switch (c) {
            case 'A':
                count[0]++;
                break;
            case 'C':
                count[1]++;
                break;
            case 'G':
                count[2]++;
                break;
            case 'T':
                count[3]++;
                break;
        }
    }

    private static void removeChar(char c, int[] count) {
        switch (c) {
            case 'A':
                count[0]--;
                break;
            case 'C':
                count[1]--;
                break;
            case 'G':
                count[2]--;
                break;
            case 'T':
                count[3]--;
                break;
        }
    }

    private static boolean isValid(int[] current, int[] required) {
        for (int i = 0; i < 4; i++) {
            if (current[i] < required[i]) return false;
        }
        return true;
    }
}
