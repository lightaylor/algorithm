package silver5.test_24313;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String result;

        if (c < a[0]) {
            result = "0";
        } else {
            result = ((c - a[0]) * n) >= a[1] ? "1" : "0";
        }

        bw.write(result);
        bw.close();
    }
}
