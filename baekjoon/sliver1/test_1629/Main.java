package sliver1.test_1629;

import java.io.*;
import java.util.stream.Stream;

/*
    모듈러 연산
    (a * b) % n = ((a % n) * (b % n)) mod n
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] n = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        bw.write(String.valueOf(pow(n[0], n[1], n[2])));
        bw.close();
    }

    private static long pow(long a, long b, long c) {
        if (b == 0) {
            return 1 % c;
        }
        if (b == 1) {
            return a % c;
        }

        long temp = pow(a, b/2, c);
        if (b % 2 == 0) {
            return temp * temp % c;
        } else {
            return (temp * temp % c) * a % c;
        }
    }
}
