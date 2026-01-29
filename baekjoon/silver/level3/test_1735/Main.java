package baekjoon.silver.level3.test_1735;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long n = ((long) a[0] * b[1]) + ((long) b[0] * a[1]);
        long m = (long) a[1] * b[1];
        long lcm = (n * m) / gcd(n, m);

        bw.write((lcm / m)  + " " + (lcm / n));
        bw.close();
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
