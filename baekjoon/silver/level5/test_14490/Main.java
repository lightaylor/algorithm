package silver.level5.test_14490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(":");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int gcd = gcd(a, b);
        System.out.print(a / gcd + ":" + b / gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
