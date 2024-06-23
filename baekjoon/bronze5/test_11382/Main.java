package bronze5.test_11382;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        bw.write(String.valueOf(arr[0] + arr[1] + arr[2]));
        bw.close();
    }
}
