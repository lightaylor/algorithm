package bronze3.test_16431;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] bessie = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] daisy = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] jone = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int B = Math.max(Math.abs(jone[0]-bessie[0]), Math.abs(jone[1]-bessie[1]));
        int D = Math.abs(jone[0]-daisy[0]) + Math.abs(jone[1]-daisy[1]);

        if (B == D) {
            bw.write("tie");
        } else {
            bw.write(B < D ? "bessie" : "daisy");
        }

        bw.close();
    }
}
