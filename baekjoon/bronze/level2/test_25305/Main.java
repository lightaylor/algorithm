package bronze.level2.test_25305;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] rank = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] score = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(score);
        bw.write(String.valueOf(score[rank[0] - rank[1]]));
        bw.close();
    }
}
