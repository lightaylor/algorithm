package bronze4.test_28490;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (answer > 0) {
                answer = Math.max(arr[0] * arr[1], answer);
            } else {
                answer = arr[0] * arr[1];
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
