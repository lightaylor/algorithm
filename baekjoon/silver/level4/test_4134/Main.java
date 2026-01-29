package baekjoon.silver.level4.test_4134;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(br.readLine());

            while(true) {
                if(isPrime(temp)) {
                    bw.write(String.valueOf(temp));
                    bw.newLine();
                    break;
                } else {
                    temp++;
                }
            }
        }
        bw.close();
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
