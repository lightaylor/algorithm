package gold.level5.test_12919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.print(dfs(s, t) ? 1 : 0);
    }

    private static boolean dfs(String s, String t) {
        if (t.length() == s.length()) {
            return s.equals(t);
        }

        boolean bool = false;
        if (t.endsWith("A")) bool |= dfs(s, t.substring(0, t.length() - 1));
        if (t.startsWith("B"))
            bool |= dfs(s, new StringBuilder(t.substring(1)).reverse().toString());

        return bool;
    }
}
