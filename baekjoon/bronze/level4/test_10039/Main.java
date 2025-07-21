package bronze.level4.test_10039;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) sum += (Math.max(sc.nextInt(), 40));
        System.out.print(sum / 5);
    }
}
