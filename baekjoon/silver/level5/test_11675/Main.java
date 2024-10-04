package silver.level5.test_11675;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i : arr) {
            for (int j = 0; j < 256; j++) {
                if (Integer.parseInt(Integer.toBinaryString(j ^ (j << 1 & 255)), 2) == i) {
                    bw.write(j + " ");
                    break;
                }
            }
        }
        bw.close();
    }
}
