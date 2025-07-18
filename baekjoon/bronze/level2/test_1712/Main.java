package bronze.level2.test_1712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c <= b) {
            System.out.print(-1);
        } else {
            int n = a / (c - b) + 1;
            System.out.print(n);
        }
    }
}
