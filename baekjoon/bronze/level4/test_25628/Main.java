package bronze.level4.test_25628;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = n[0] / 2;
        bw.write(String.valueOf(Math.min(a, n[1])));
        bw.close();

    }
}
