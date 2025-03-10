package bronze.level4.test_26566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a1 = sc.nextInt();
            int p1 = sc.nextInt();
            int r2 = sc.nextInt();
            int p2 = sc.nextInt();

            if ((double) a1 / p1 > (r2 * r2 * Math.PI) / p2) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
    }
}
