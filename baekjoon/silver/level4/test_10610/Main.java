package baekjoon.silver.level4.test_10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] N = br.readLine().toCharArray();
        int[] numbers = new int[N.length];
        boolean hasZero = false;
        int sum = 0;

        for (int i = 0; i < N.length; i++) {
            numbers[i] = N[i] - '0';
            sum += numbers[i];
            if (numbers[i] == 0) {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.print(-1);
            return;
        }

        StringBuilder answer = new StringBuilder();
        Arrays.sort(numbers);
        for (int i = N.length - 1; i >= 0; i--) {
            answer.append(numbers[i]);
        }

        System.out.print(answer);
    }
}


/**
 * 3의 배수 판별법
 * 모든 숫자의 합이 3의 배수이면
 * 그 숫자는 3의 배수이다.
**/
