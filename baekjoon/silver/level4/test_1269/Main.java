package baekjoon.silver.level4.test_1269;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                j++;
            } else if (a[i] < b[j]){
                i++;
            } else {
                i++;
                j++;
                count++;
            }
        }

        bw.write(String.valueOf(b.length + a.length - (2 * count)));
        bw.close();
    }
}
