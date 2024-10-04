package silver.level5.test_5046;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minPrice = 0;

        for (int i = 0; i < arr[2]; i++) {
            int price = Integer.parseInt(br.readLine());
            int[] cap = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (Arrays.stream(cap).anyMatch(n -> n >= arr[0]) && price * arr[0] <= arr[1]) {
                if (minPrice > 0) {
                    minPrice = Math.min(minPrice, price * arr[0]);
                } else {
                    minPrice = price * arr[0];
                }
            }
        }

        if (minPrice == 0) {
            bw.write("stay home");
        } else {
            bw.write(String.valueOf(minPrice));
        }
        bw.close();
    }
}
