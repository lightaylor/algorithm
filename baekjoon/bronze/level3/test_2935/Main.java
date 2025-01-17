package bronze.level3.test_2935;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger number1 = new BigInteger(sc.nextLine());
        String operator = sc.nextLine();
        BigInteger number2 = new BigInteger(sc.nextLine());

        if (operator.equals("*")) {
            System.out.print(number1.multiply(number2));
        } else {
            System.out.print(number1.add(number2));
        }
    }
}
