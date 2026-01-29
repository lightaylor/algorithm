package baekjoon.bronze.level1.test_2804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String a = str[0];
        String b = str[1];

        int Acount = -1;
        int Bcount = -1;
        boolean bool = false;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    Acount = i;
                    Bcount = j;
                    bool = true;
                    break;
                }
            }
            if (bool) break;
        }

        for (int i = 0; i < b.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < a.length(); j++) {
                if (i == Bcount) sb.append(a.charAt(j));
                else if (j == Acount) sb.append(b.charAt(i));
                else sb.append(".");
            }
            System.out.println(sb);
        }
    }
}
