package silver3.test_1929;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = arr[0]; i <= arr[1]; i++) {
            if(isPrime(i)) {
                bw.write(String.valueOf(i));
                bw.newLine();
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
