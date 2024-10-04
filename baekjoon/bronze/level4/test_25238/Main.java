package bronze.level4.test_25238;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double sum = arr[0] - ((double) (arr[0] * arr[1]) / 100);

        bw.write(sum >= 100 ? "0" : "1");
        bw.close();
    }
}
