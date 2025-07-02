package bronze.level1.test_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = number;
        int count = 0;

        do {
            int a = n / 10;
            int b = n % 10;
            n = b * 10 + (a + b) % 10;
            count++;
        } while (n != number);

        System.out.print(count);
    }
}
