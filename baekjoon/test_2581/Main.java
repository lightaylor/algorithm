package test_2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n =Integer.parseInt(br.readLine());
        int sum = 0, min = n;

        for (int i = m; i <= n; i++) {
            if (i != 1 && isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum == 0) bw.write("-1");
        else bw.write(sum + "\n" + min);
        bw.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
