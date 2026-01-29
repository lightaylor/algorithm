package baekjoon.silver.level3.test_3613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();

        if (a.length == 0 || a[0] == '_' || a[a.length - 1] == '_' || (a[0] >= 'A' && a[0] <= 'Z')) {
            error();
            return;
        }

        boolean java = false, cpp = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            char c = a[i];

            if (c == '_') {
                if (i + 1 >= a.length || a[i + 1] < 'a' || a[i + 1] > 'z') {
                    error();
                    return;
                }
                cpp = true;
                sb.append((char) (a[++i] - 32));
            } else if (c >= 'A' && c <= 'Z') {
                java = true;
                sb.append('_').append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else {
                error();
                return;
            }

            if (java && cpp) {
                error();
                return;
            }
        }

        System.out.print(sb);
    }

    private static void error() {
        System.out.print("Error!");
    }
}
