package baekjoon.bronze.level4.test_2530;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt() + sc.nextInt();

        b += c / 60;
        c = c % 60;

        a += b / 60;
        b = b % 60;

        a = a % 24;
        System.out.printf("%d %d %d", a, b, c);
    }
}
