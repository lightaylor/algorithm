package bronze.level3.test_5073;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (Arrays.stream(arr).sum() > 0) {
            Arrays.sort(arr);
            if (arr[0] + arr[1] <= arr[2]) {
                bw.write("Invalid\n");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                bw.write("Equilateral\n");
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
            arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bw.close();
    }
}
