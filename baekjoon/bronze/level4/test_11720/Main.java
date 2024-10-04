package bronze.level4.test_11720;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
