package bronze3.test_14215;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        if (arr[0] + arr[1] <= arr[2]) {
            arr[2] = arr[0] + arr[1] - 1;
        }
        bw.write(String.valueOf(Arrays.stream(arr).sum()));
        bw.close();
    }
}
