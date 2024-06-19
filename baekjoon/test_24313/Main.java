package test_24313;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(br.readLine());
        int g = Integer.parseInt(br.readLine());


        String result = n[0] <= c && n[0] < n[1] && n[0] * g + n[1] <= g * c ? "1" : "0";

        bw.write(result);
        bw.close();
    }
}
