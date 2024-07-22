package silver5.test_25496;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] PN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int i = 0;
        int answer = 0;

        while (PN[0] < 200 && i < arr.length) {
            PN[0] += arr[i++];
            answer++;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
