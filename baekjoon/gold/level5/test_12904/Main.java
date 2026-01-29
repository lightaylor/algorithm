package baekjoon.gold.level5.test_12904;

import java.util.Scanner;

public class Main {
    private static String S;
    private static String T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        T = sc.nextLine();

        System.out.print(go(new StringBuilder(T)) ? 1 : 0);
    }

    private static boolean go(StringBuilder sb) {
        if (sb.toString().equals(S)) {
            return true;
        }

        if (sb.length() < S.length()) {
            return false;
        }

        boolean result = false;
        if (sb.charAt(sb.length() - 1) == 'A') {
            sb.deleteCharAt(sb.length() - 1);
            result = go(sb);
            sb.append('A');
        }

        if (!result && sb.charAt(sb.length() - 1) == 'B') {
            sb.deleteCharAt(sb.length() - 1).reverse();
            result = go(sb);
            sb.reverse().insert(0, 'B');
        }

        return result;
    }
}
