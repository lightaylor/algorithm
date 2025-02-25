package bronze.level5.test_25372;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String password = sc.nextLine();
            String answer = "no";

            if (6 <= password.length() && password.length() <= 9) {
                for (char c : password.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        break;
                    }
                }
                answer = "yes";
            }
            System.out.println(answer);
        }
    }
}
