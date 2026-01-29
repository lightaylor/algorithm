package baekjoon.bronze.level4.test_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        while (!input.equals("#")) {
            int count = 0;
            for (char c : input.toLowerCase().toCharArray()) {
                for (int i = 0; i < 5; i++) {
                    if (c == aeiou[i]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            input = sc.nextLine();
        }
    }
}
