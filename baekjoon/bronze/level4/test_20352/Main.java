package bronze.level4.test_20352;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double r = Math.sqrt(a / Math.PI);
        System.out.print(r * 2 * Math.PI);
    }
}
