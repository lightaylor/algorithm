package baekjoon.bronze.level2.test_12605;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] str = sc.nextLine().split(" ");
            StringBuffer sb = new StringBuffer("Case #" + i + ": ");
            for (int j = str.length - 1; j >= 0; j--) {
                sb.append(str[j]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
