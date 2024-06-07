package test_5086;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        while (arr[0] + arr[1] != 0) {
            if ((Math.max(arr[0], arr[1]) % Math.min(arr[0], arr[1])) == 0) {
                bw.write(arr[0] > arr[1] ? "multiple\n" : "factor\n");
            } else {
                bw.write("neither\n");
            }
            arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }
        bw.close();
    }
}
