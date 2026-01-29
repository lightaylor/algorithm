package baekjoon.bronze.level2.test_5218;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder("Distances: ");
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < str[0].length(); j++) {
                int sum = str[1].charAt(j) - str[0].charAt(j);
                sb.append(sum < 0 ? sum + 26 : sum).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
