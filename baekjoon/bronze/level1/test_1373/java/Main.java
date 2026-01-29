package baekjoon.bronze.level1.test_1373.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        BigInteger i = new BigInteger(input, 2);
        System.out.print(i.toString(8));
    }
}
