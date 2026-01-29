package baekjoon.silver.level5.test_13241;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long result = arr[0] * arr[1] / gcd(arr[0], arr[1]);

        bw.write(String.valueOf(result));
        bw.close();
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd (b, a % b);
    }
}
