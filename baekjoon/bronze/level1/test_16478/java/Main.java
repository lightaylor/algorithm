package bronze.level1.test_16478.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int cd = sc.nextInt();

        double answer = (double) (ab * cd) / bc;

        if (answer == (long) answer) System.out.print((int) answer);
        else System.out.print(answer);
    }
}
