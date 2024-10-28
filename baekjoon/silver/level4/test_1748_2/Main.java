package silver.level4.test_1748_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int digit = N.length();

        double answer = (Long.parseLong(N) - Math.pow(10, digit - 1) + 1) * digit;
        for (int i = 1; i < digit; i++) {
            answer += 9 * Math.pow(10, i - 1) * i;
        }

        System.out.print((int) answer);
    }
}
