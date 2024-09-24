package bronze3.test_14579;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 1;
        int temp = 0;

        for (int i = 1; i <= arr[1]; i++) {
            temp += i;
            if (i >= arr[0]) {
                answer = (answer * temp) % 14579;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
