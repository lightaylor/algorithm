package baekjoon.silver.level3.test_17413;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean insideTag = false;
        for (char ch : input.toCharArray()) {
            if (ch == '<') {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0);
                }
                insideTag = true;
                result.append(ch);
            } else if (ch == '>') {
                insideTag = false;
                result.append(ch);
            } else if (insideTag) {
                result.append(ch);
            } else if (ch == ' ') {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0);
                }
                result.append(ch);
            } else {
                word.append(ch);
            }
        }

        if (word.length() > 0) {
            result.append(word.reverse());
        }

        System.out.print(result);
    }
}
