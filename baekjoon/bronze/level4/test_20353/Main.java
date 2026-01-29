package baekjoon.bronze.level4.test_20353;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double length = Math.sqrt(a);
        System.out.print(length * 4);
    }
}
