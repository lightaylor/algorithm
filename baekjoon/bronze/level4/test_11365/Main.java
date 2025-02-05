package bronze.level4.test_11365;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }
            System.out.println(new StringBuilder(input).reverse());
        }
    }
}
