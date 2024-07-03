package silver4.test_2485;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] colonnades = new long[n];

        colonnades[0] = Long.parseLong(br.readLine());
        colonnades[1] = Long.parseLong(br.readLine());
        long interval = colonnades[1] - colonnades[0];
        for (int i = 2; i < n; i ++) {
            colonnades[i] = Long.parseLong(br.readLine());
            long temp = colonnades[i] - colonnades[i - 1];
            interval = gcd(interval, temp);
        }

        long answer =  (colonnades[n - 1] - colonnades[0]) / interval + 1;
        bw.write(String.valueOf(answer - n));
        bw.close();
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
