package bronze.level1.test_2869.java;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = (input[2] - input[0]) / (input[0] - input[1]);
        count += (input[2] - input[0]) % (input[0] - input[1]) > 0 ? 1 : 0;

        bw.write(String.valueOf(count + 1));
        bw.close();
    }
}
