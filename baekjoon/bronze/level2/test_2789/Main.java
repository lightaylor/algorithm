package bronze.level2.test_2789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] words = "CAMBRIDGE".toCharArray();
        String targets = sc.nextLine();

        for (char word : words) {
            targets = targets.replaceAll(Character.toString(word), "");
        }
        System.out.print(targets);
    }
}
