package baekjoon.bronze.level2.test_3062;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder().append(n);
            sb.reverse();
            n += Integer.parseInt(sb.toString());

            String str = String.valueOf(n);
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println(str.equals(reversed) ? "YES" : "NO");
        }
    }
}
