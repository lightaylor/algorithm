package baekjoon.bronze.level2.test_5598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] words = sc.nextLine().toCharArray();
        for (char word : words) {
            char ch = (char) (word < 'D' ? word + 23 : word - 3);
            System.out.print(ch);
        }
    }
}
