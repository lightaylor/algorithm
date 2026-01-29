package baekjoon.silver.level2.test_4948;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        while (input > 0) {
            int count = 0;
            for (int i = input + 1; i <= 2 * input; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
            input = Integer.parseInt(br.readLine());
        }
        bw.close();
    }

    public static boolean isPrime (int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
