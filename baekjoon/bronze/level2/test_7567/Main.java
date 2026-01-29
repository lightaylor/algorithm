package baekjoon.bronze.level2.test_7567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        int sum = 10;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i - 1] == arr[i] ? 5 : 10;
        }
        System.out.print(sum);
    }
}
