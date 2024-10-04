package bronze.level5.test_3003;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < arr.length; i++) {
            bw.write(arr[i] - input[i] + " ");
        }
        bw.close();
    }
}
