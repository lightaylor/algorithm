package silver.level5.test_15904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray();
        char[] UCPC = {'U', 'C', 'P', 'C'};
        int index = 0;

        for (char c : word) {
            if (UCPC[index] == c) index++;
            if (index == 4) {
                System.out.print("I love UCPC");
                return;
            }
        }
        System.out.print("I hate UCPC");
    }
}
