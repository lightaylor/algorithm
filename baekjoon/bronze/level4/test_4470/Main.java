package baekjoon.bronze.level4.test_4470;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append(". ").append(sc.nextLine()).append("\n");
        }

        System.out.print(sb);
    }
}
