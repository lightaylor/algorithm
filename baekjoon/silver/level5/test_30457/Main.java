package silver.level5.test_30457;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int left = 0;
        int right = 0;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (left < arr[i] || right < arr[i]) {
                if (left <= right) {
                    left = arr[i];
                } else {
                    right = arr[i];
                }
                answer += 1;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
