package bronze.level5.test_1271;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);

        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
    }
}
