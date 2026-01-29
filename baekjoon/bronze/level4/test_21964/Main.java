package baekjoon.bronze.level4.test_21964;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        System.out.print(str.substring(str.length() - 5));
    }
}
