package baekjoon.bronze.level2.test_16485;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double answer = (double) a / b;
        if (answer == (long) answer) {
            System.out.print((long) answer);
        } else {
            System.out.printf("%.10f", answer);
        }
    }
}
