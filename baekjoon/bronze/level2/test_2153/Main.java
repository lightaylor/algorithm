package bronze.level2.test_2153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        int sum = 0;
        for (char c : arr) {
            if (c > 'Z') sum += c - 'a' + 1;
            else sum += c - 'A' + 27;

        }

        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) {
                System.out.print("It is not a prime word.");
                return;
            }
        }
        System.out.print("It is a prime word.");
    }
}
