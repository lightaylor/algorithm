package bronze.level5.test_2420;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] n = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long answer = Math.max(n[0], n[1]) - Math.min(n[0], n[1]);

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
