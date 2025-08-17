package bronze.level3.test_2576;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int odd = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                sum += num;
                odd = Math.min(odd, num);
            }
        }

        String answer = odd == Integer.MAX_VALUE ? "-1" : sum + "\n" + odd;
        System.out.println(answer);
    }
}
