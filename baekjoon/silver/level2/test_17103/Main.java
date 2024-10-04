package silver.level2.test_17103;

import java.io.*;

/*
6 = 3 + 3
8 = 3 + 5
10 = 3 + 7 / 5 + 5
12 = 5 + 7
100 = 3 + 98 / 11 + 89 / 17 + 83 / 29 + 71 / 41 + 59 / 47 + 53
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[1000001];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = isPrime(i);
        }

        for (int i = 0; i < n; i++) {
            long m = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= m/2; j++) {
                if (arr[j] && arr[(int) (m - j)]) {
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        bw.close();
    }

    public static boolean isPrime(int n) {
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
