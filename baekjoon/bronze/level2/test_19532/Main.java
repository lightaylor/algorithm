package bronze.level2.test_19532;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];
        int e = arr[4];
        int f = arr[5];

        for(int x = -999; x < 1000; x++) {
            for(int y = -999; y < 1000; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    bw.write(x + " " + y);
                    bw.close();
                    break;
                }
            }
        }
    }
}
