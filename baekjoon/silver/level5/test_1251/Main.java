package silver.level5.test_1251;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String answer = "";
        for (int i = 1; i < word.length() - 2; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String first = new StringBuilder(word.substring(0, i)).reverse().toString();
                String second = new StringBuilder(word.substring(i, j)).reverse().toString();
                String third = new StringBuilder(word.substring(j)).reverse().toString();

                String result = first + second + third;
                if (answer.isEmpty() || answer.compareTo(result) > 0)
                    answer = result;
            }
        }
        System.out.print(answer);
    }
}
