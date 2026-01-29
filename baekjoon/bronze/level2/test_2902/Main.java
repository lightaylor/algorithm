package baekjoon.bronze.level2.test_2902;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("-");

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str.charAt(0));
        }

        System.out.print(sb);
    }
}
