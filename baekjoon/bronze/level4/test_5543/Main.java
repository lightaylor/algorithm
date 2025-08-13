package bronze.level4.test_5543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print(Math.min(a,Math.min(c, b)) + Math.min(x, y) - 50);
    }
}
