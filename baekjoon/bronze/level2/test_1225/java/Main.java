package baekjoon.bronze.level2.test_1225.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        long sum = 0;
        for (char a : arr[0].toCharArray()) {
            for (char b : arr[1].toCharArray()) {
                sum += (long) (a - '0') * (b - '0');
            }
        }
        System.out.print(sum);
    }
}
