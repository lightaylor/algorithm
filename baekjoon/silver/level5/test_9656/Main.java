package silver.level5.test_9656;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n%2 == 0 ? "SK" : "CY");
    }
}
