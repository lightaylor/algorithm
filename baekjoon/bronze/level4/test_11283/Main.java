package baekjoon.bronze.level4.test_11283;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);
        int base = 0xAC00;
        int index = ch - base + 1;
        System.out.print(index);
    }
}
