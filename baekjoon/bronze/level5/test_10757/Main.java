package baekjoon.bronze.level5.test_10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        BigInteger sum = new BigInteger("0");
        for (String num : arr) {
            sum = sum.add(new BigInteger(num));
        }
        System.out.print(sum);
    }
}
