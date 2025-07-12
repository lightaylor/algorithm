package silver.level4.test_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n < 100 ? n : 99;
        for (int i = 100; i <= n; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;
            if (tens - hundreds == ones - tens) sum++;
        }
        System.out.print(sum);
    }
}
