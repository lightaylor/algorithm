package silver.level5.test_15803;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        if ((y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1))
            System.out.print("WHERE IS MY CHICKEN?");
        else System.out.print("WINNER WINNER CHICKEN DINNER!");
    }
}
