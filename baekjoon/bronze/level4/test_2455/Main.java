package bronze.level4.test_2455;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count = count - sc.nextInt() + sc.nextInt();
            max = Math.max(max, count);
        }

        System.out.print(max);
    }
}
