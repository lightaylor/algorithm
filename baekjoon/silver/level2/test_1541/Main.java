package baekjoon.silver.level2.test_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        StringBuilder num = new StringBuilder();
        char op = '+';
        int sum = 0;

        for (char c : input) {
            if (Character.isDigit(c)) {
                num.append(c);
            } else  {
                sum = applyOperation(sum, num.toString(), op);
                if (c == '-' && op == '+') {
                    op = '-';
                }
                num = new StringBuilder();
            }
        }

        sum = applyOperation(sum, num.toString(), op);

        System.out.print(sum);
    }

    private static int applyOperation(int a, String strB, char op) {
        int b = Integer.parseInt(strB);
        return op == '+' ? a + b : a - b;
    }
}
