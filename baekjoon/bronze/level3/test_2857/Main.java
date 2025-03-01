package bronze.level3.test_2857;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            String name = sc.nextLine();

            if (name.length() > 10 || !name.contains("FBI")) continue;
            for (char ch : name.toCharArray()) {
                if (!(Character.isDigit(ch) || ch == '-' || Character.isUpperCase(ch)))
                    break;
            }
            answer.append(i).append(" ");
        }
        System.out.print(answer.length() == 0 ? "HE GOT AWAY!" : answer.toString().trim());
    }
}
