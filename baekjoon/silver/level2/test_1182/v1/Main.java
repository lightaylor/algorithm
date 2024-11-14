package silver.level2.test_1182.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] set = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int s = arr[1];
        int answer = 0;

        for (int i = 1; i < (1<<n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1<<j)) != 0) {
                    sum += set[j];
                }
            }
            if (sum == s) {
                answer += 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
